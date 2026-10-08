package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class TarjanAlgorithm {
    public static List<List<Integer>> tarjanScc(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = GraphAdjacencyList.buildDirectedGraph(n, edges);
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        int[] discovery = new int[n];
        int[] low = new int[n];
        int[] timer = new int[1];
        Stack<Integer> stack = new Stack<>();
        boolean[] inStack = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                dfs(graph, i, discovery, low, timer, stack, inStack, visited, result);
            }
        }
        return result;
    }

    private static void dfs(Map<Integer, List<Integer>> graph, int node, int[] discovery, int[] low, int[] timer,
                           Stack<Integer> stack, boolean[] inStack, Set<Integer> visited, List<List<Integer>> result) {
        visited.add(node);
        discovery[node] = low[node] = timer[0]++;
        stack.push(node);
        inStack[node] = true;

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, discovery, low, timer, stack, inStack, visited, result);
                low[node] = Math.min(low[node], low[neighbor]);
            } else if (inStack[neighbor]) {
                low[node] = Math.min(low[node], discovery[neighbor]);
            }
        }

        if (low[node] == discovery[node]) {
            List<Integer> component = new ArrayList<>();
            int current;
            do {
                current = stack.pop();
                inStack[current] = false;
                component.add(current);
            } while (current != node);
            result.add(component);
        }
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {1, 2}, {2, 0}, {2, 3} };
        System.out.println(tarjanScc(4, edges));
    }
}
