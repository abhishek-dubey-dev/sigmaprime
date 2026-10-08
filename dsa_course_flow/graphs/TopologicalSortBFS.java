package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;

public class TopologicalSortBFS {
    public static List<Integer> topoSort(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = GraphAdjacencyList.buildDirectedGraph(n, edges);
        int[] indegree = new int[n];
        for (int[] edge : edges) {
            if (edge != null && edge.length >= 2) {
                int u = edge[0];
                int v = edge[1];
                if (u >= 0 && u < n && v >= 0 && v < n) {
                    indegree[v]++;
                }
            }
        }

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.addLast(i);
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.removeFirst();
            order.add(node);
            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.addLast(neighbor);
                }
            }
        }
        return order;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {0, 2}, {1, 3}, {2, 3} };
        System.out.println(topoSort(4, edges));
    }
}
