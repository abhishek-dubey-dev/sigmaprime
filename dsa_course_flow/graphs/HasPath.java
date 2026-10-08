package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HasPath {
    public static boolean hasPath(int n, int[][] edges, int source, int destination) {
        return hasPath(GraphAdjacencyList.buildUndirectedGraph(n, edges), source, destination);
    }

    public static boolean hasPath(Map<Integer, List<Integer>> graph, int source, int destination) {
        if (graph == null || source == destination) {
            return true;
        }
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int node = queue.removeFirst();
            if (node == destination) {
                return true;
            }
            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (visited.add(neighbor)) {
                    queue.addLast(neighbor);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {1, 2}, {2, 3}, {3, 4} };
        System.out.println(hasPath(5, edges, 0, 4));
    }
}
