package graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimAlgorithm {
    public static int primMSTCost(int n, int[][] edges) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            if (edge != null && edge.length >= 3) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                graph.get(u).add(new int[] { v, w });
                graph.get(v).add(new int[] { u, w });
            }
        }

        boolean[] visited = new boolean[n];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        queue.add(new int[] { 0, 0 });

        int total = 0;
        while (!queue.isEmpty() && visited.length > 0) {
            int[] current = queue.poll();
            int weight = current[0];
            int node = current[1];
            if (visited[node]) {
                continue;
            }
            visited[node] = true;
            total += weight;
            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int nextWeight = neighbor[1];
                if (!visited[nextNode]) {
                    queue.add(new int[] { nextWeight, nextNode });
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1, 4}, {0, 2, 1}, {1, 2, 2}, {1, 3, 3}, {2, 3, 5} };
        System.out.println(primMSTCost(4, edges));
    }
}
