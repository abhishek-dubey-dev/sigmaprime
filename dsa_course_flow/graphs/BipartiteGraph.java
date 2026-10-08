package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;

public class BipartiteGraph {
    public static boolean isBipartite(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = GraphAdjacencyList.buildUndirectedGraph(n, edges);
        int[] color = new int[n];
        java.util.Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                Deque<Integer> queue = new ArrayDeque<>();
                queue.addLast(i);
                color[i] = 0;
                while (!queue.isEmpty()) {
                    int node = queue.removeFirst();
                    for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                        if (color[neighbor] == -1) {
                            color[neighbor] = 1 - color[node];
                            queue.addLast(neighbor);
                        } else if (color[neighbor] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {1, 2}, {2, 3}, {3, 0} };
        System.out.println(isBipartite(4, edges));
    }
}
