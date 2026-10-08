package graphs;

public class MinimumSpanningTree {
    public static int minCost(int n, int[][] edges) {
        return KruskalAlgorithm.kruskalMSTCost(n, edges);
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1, 4}, {0, 2, 1}, {1, 2, 2}, {1, 3, 3}, {2, 3, 5} };
        System.out.println(minCost(4, edges));
    }
}
