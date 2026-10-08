package graphs;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {
    public static List<List<Integer>> allPaths(int[][] graph, int source, int target) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(graph, source, target, current, paths);
        return paths;
    }

    private static void dfs(int[][] graph, int node, int target, List<Integer> current, List<List<Integer>> paths) {
        current.add(node);
        if (node == target) {
            paths.add(new ArrayList<>(current));
            current.remove(current.size() - 1);
            return;
        }
        for (int neighbor : graph[node]) {
            dfs(graph, neighbor, target, current, paths);
        }
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[][] graph = { {1, 2}, {3}, {3}, {}};
        System.out.println(allPaths(graph, 0, 3));
    }
}
