package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFS {
    public static List<Integer> dfs(int n, int[][] edges, int start) {
        return dfs(GraphAdjacencyList.buildUndirectedGraph(n, edges), start);
    }

    public static List<Integer> dfs(Map<Integer, List<Integer>> graph, int start) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        dfsVisit(graph, start, visited, result);
        return result;
    }

    private static void dfsVisit(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited, List<Integer> result) {
        visited.add(node);
        result.add(node);
        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (visited.add(neighbor)) {
                dfsVisit(graph, neighbor, visited, result);
            }
        }
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {0, 2}, {1, 3}, {2, 3}, {3, 4} };
        System.out.println(dfs(5, edges, 0));
    }
}
