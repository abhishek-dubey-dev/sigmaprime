package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BFS {
    public static List<Integer> bfs(int n, int[][] edges, int start) {
        return bfs(GraphAdjacencyList.buildUndirectedGraph(n, edges), start);
    }

    public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> queue = new ArrayDeque<>();

        if (graph == null || !graph.containsKey(start)) {
            return result;
        }

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.removeFirst();
            result.add(node);
            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                if (visited.add(neighbor)) {
                    queue.addLast(neighbor);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 4} };
        System.out.println(bfs(5, edges, 0));
    }
}
