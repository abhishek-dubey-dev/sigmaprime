package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConnectedComponents {
    public static int countConnectedComponents(int n, int[][] edges) {
        return connectedComponents(n, edges).size();
    }

    public static List<List<Integer>> connectedComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = GraphAdjacencyList.buildUndirectedGraph(n, edges);
        Set<Integer> visited = new HashSet<>();
        List<List<Integer>> components = new ArrayList<>();

        for (int node = 0; node < n; node++) {
            if (!visited.contains(node)) {
                List<Integer> component = new ArrayList<>();
                dfs(graph, node, visited, component);
                components.add(component);
            }
        }
        return components;
    }

    private static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited, List<Integer> component) {
        visited.add(node);
        component.add(node);
        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, visited, component);
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {1, 2}, {3, 4} };
        System.out.println(connectedComponents(5, edges));
    }
}
