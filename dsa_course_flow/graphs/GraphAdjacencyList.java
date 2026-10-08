package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphAdjacencyList {
    public static Map<Integer, List<Integer>> buildGraph(int n, int[][] edges, boolean directed) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        if (edges == null) {
            return graph;
        }

        for (int[] edge : edges) {
            if (edge == null || edge.length < 2) {
                continue;
            }
            int u = edge[0];
            int v = edge[1];
            if (u < 0 || u >= n || v < 0 || v >= n) {
                continue;
            }
            graph.get(u).add(v);
            if (!directed) {
                graph.get(v).add(u);
            }
        }
        return graph;
    }

    public static Map<Integer, List<Integer>> buildUndirectedGraph(int n, int[][] edges) {
        return buildGraph(n, edges, false);
    }

    public static Map<Integer, List<Integer>> buildDirectedGraph(int n, int[][] edges) {
        return buildGraph(n, edges, true);
    }

    public static void printGraph(Map<Integer, List<Integer>> graph) {
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {0, 2}, {1, 2}, {2, 3} };
        Map<Integer, List<Integer>> graph = buildUndirectedGraph(4, edges);
        printGraph(graph);
    }
}
