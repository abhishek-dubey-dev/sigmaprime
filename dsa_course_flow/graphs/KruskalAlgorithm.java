package graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KruskalAlgorithm {
    public static int kruskalMSTCost(int n, int[][] edges) {
        List<int[]> edgeList = new ArrayList<>();
        for (int[] edge : edges) {
            if (edge != null && edge.length >= 3) {
                edgeList.add(edge);
            }
        }
        edgeList.sort(Comparator.comparingInt(a -> a[2]));

        DisjointSetUnion dsu = new DisjointSetUnion(n);
        int cost = 0;
        int selected = 0;
        for (int[] edge : edgeList) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if (dsu.union(u, v)) {
                cost += w;
                selected++;
                if (selected == n - 1) {
                    break;
                }
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1, 4}, {0, 2, 1}, {1, 2, 2}, {1, 3, 3}, {2, 3, 5} };
        System.out.println(kruskalMSTCost(4, edges));
    }
}
