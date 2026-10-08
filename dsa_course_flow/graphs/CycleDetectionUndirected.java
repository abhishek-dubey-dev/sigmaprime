package graphs;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CycleDetectionUndirected {
    public static boolean hasCycle(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = GraphAdjacencyList.buildUndirectedGraph(n, edges);
        Set<Integer> visited = new HashSet<>();

        for (int node = 0; node < n; node++) {
            if (!visited.contains(node) && dfs(graph, node, -1, visited)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(Map<Integer, List<Integer>> graph, int node, int parent, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (neighbor == parent) {
                continue;
            }
            if (visited.contains(neighbor)) {
                return true;
            }
            if (dfs(graph, neighbor, node, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {1, 2}, {2, 3}, {3, 0} };
        System.out.println(hasCycle(4, edges));
    }
}
