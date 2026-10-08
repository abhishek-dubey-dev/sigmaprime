package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StronglyConnectedComponentsKosaraju {
    public static List<List<Integer>> kosarajuScc(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = GraphAdjacencyList.buildDirectedGraph(n, edges);
        Map<Integer, List<Integer>> reverse = GraphAdjacencyList.buildUndirectedGraph(n, new int[0][]);
        for (int[] edge : edges) {
            if (edge != null && edge.length >= 2) {
                reverse.get(edge[1]).add(edge[0]);
            }
        }

        List<Integer> order = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                dfs(graph, i, visited, order);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        visited.clear();
        Collections.reverse(order);
        for (int node : order) {
            if (!visited.contains(node)) {
                List<Integer> component = new ArrayList<>();
                reverseDfs(reverse, node, visited, component);
                result.add(component);
            }
        }
        return result;
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

    private static void reverseDfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited, List<Integer> component) {
        visited.add(node);
        component.add(node);
        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                reverseDfs(graph, neighbor, visited, component);
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {1, 2}, {2, 0}, {2, 3} };
        System.out.println(kosarajuScc(4, edges));
    }
}
