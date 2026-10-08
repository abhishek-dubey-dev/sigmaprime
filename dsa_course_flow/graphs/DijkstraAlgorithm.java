package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static long[] dijkstra(int n, int[][] edges, int source) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            if (edge == null || edge.length < 3) {
                continue;
            }
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if (u >= 0 && u < n && v >= 0 && v < n) {
                graph.get(u).add(new int[] { v, w });
            }
        }

        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE / 4);
        distance[source] = 0;

        PriorityQueue<long[]> queue = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        queue.add(new long[] { 0, source });

        while (!queue.isEmpty()) {
            long[] current = queue.poll();
            long dist = current[0];
            int node = (int) current[1];
            if (dist > distance[node]) {
                continue;
            }
            for (int[] edge : graph.get(node)) {
                int neighbor = edge[0];
                long newDistance = dist + edge[1];
                if (newDistance < distance[neighbor]) {
                    distance[neighbor] = newDistance;
                    queue.add(new long[] { newDistance, neighbor });
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1, 4}, {0, 2, 1}, {2, 1, 2}, {1, 3, 1}, {2, 3, 5} };
        System.out.println(Arrays.toString(dijkstra(4, edges, 0)));
    }
}
