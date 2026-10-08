package graphs;

import java.util.Arrays;

public class BellmanFordAlgorithm {
    public static long[] bellmanFord(int n, int[][] edges, int source) {
        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE / 4);
        distance[source] = 0;

        for (int i = 0; i < n - 1; i++) {
            boolean updated = false;
            for (int[] edge : edges) {
                if (edge == null || edge.length < 3) {
                    continue;
                }
                int u = edge[0];
                int v = edge[1];
                long weight = edge[2];
                if (u >= 0 && u < n && v >= 0 && v < n && distance[u] != Long.MAX_VALUE / 4) {
                    if (distance[u] + weight < distance[v]) {
                        distance[v] = distance[u] + weight;
                        updated = true;
                    }
                }
            }
            if (!updated) {
                break;
            }
        }

        for (int[] edge : edges) {
            if (edge == null || edge.length < 3) {
                continue;
            }
            int u = edge[0];
            int v = edge[1];
            long weight = edge[2];
            if (u >= 0 && u < n && v >= 0 && v < n && distance[u] != Long.MAX_VALUE / 4 && distance[u] + weight < distance[v]) {
                throw new IllegalStateException("Negative cycle detected");
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1, 4}, {0, 2, 1}, {2, 1, 2}, {1, 3, 1}, {2, 3, 5} };
        System.out.println(Arrays.toString(bellmanFord(4, edges, 0)));
    }
}
