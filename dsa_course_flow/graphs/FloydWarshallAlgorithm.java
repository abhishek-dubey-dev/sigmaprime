package graphs;

import java.util.Arrays;

public class FloydWarshallAlgorithm {
    public static long[][] floydWarshall(int n, int[][] edges) {
        long INF = Long.MAX_VALUE / 4;
        long[][] dist = new long[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int[] edge : edges) {
            if (edge == null || edge.length < 3) {
                continue;
            }
            int u = edge[0];
            int v = edge[1];
            long w = edge[2];
            if (u >= 0 && u < n && v >= 0 && v < n) {
                dist[u][v] = Math.min(dist[u][v], w);
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                if (dist[i][k] == INF) {
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    if (dist[k][j] == INF) {
                        continue;
                    }
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1, 3}, {0, 2, 6}, {1, 2, 2}, {1, 3, 1}, {2, 3, 4} };
        long[][] result = floydWarshall(4, edges);
        for (long[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
