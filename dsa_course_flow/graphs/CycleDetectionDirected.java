package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;

public class CycleDetectionDirected {
    public static boolean hasCycle(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = GraphAdjacencyList.buildDirectedGraph(n, edges);
        int[] indegree = new int[n];
        for (int[] edge : edges) {
            if (edge == null || edge.length < 2) {
                continue;
            }
            int u = edge[0];
            int v = edge[1];
            if (u >= 0 && u < n && v >= 0 && v < n) {
                indegree[v]++;
            }
        }

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.addLast(i);
            }
        }

        int processed = 0;
        while (!queue.isEmpty()) {
            int node = queue.removeFirst();
            processed++;
            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.addLast(neighbor);
                }
            }
        }
        return processed != n;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {1, 2}, {2, 0} };
        System.out.println(hasCycle(3, edges));
    }
}
