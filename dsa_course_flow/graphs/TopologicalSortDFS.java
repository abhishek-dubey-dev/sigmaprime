package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TopologicalSortDFS {
    public static List<Integer> topoSort(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = GraphAdjacencyList.buildDirectedGraph(n, edges);
        Set<Integer> visited = new HashSet<>();
        List<Integer> order = new ArrayList<>();

        for (int node = 0; node < n; node++) {
            if (!visited.contains(node)) {
                dfs(graph, node, visited, order);
            }
        }
        Collections.reverse(order);
        return order;
    }

    private static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited, List<Integer> order) {
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, visited, order);
            }
        }
        order.add(node);
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {0, 2}, {1, 3}, {2, 3} };
        System.out.println(topoSort(4, edges));
    }
}
