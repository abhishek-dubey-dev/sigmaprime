package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArticulationPoint {
    public static List<Integer> articulationPoints(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = GraphAdjacencyList.buildUndirectedGraph(n, edges);
        List<Integer> points = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        int[] discovery = new int[n];
        int[] low = new int[n];
        int[] timer = new int[1];

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                dfs(graph, i, -1, visited, discovery, low, timer, points, true);
            }
        }
        return points;
    }

    private static void dfs(Map<Integer, List<Integer>> graph, int node, int parent, Set<Integer> visited,
                           int[] discovery, int[] low, int[] timer, List<Integer> points, boolean isRoot) {
        visited.add(node);
        discovery[node] = low[node] = timer[0]++;
        int childCount = 0;

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (neighbor == parent) {
                continue;
            }
            if (!visited.contains(neighbor)) {
                childCount++;
                dfs(graph, neighbor, node, visited, discovery, low, timer, points, false);
                low[node] = Math.min(low[node], low[neighbor]);
                if (!isRoot && low[neighbor] >= discovery[node]) {
                    points.add(node);
                }
            } else {
                low[node] = Math.min(low[node], discovery[neighbor]);
            }
        }

        if (isRoot && childCount > 1) {
            points.add(node);
        }
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {1, 2}, {2, 0}, {2, 3} };
        System.out.println(articulationPoints(4, edges));
    }
}
