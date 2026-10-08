package graphs;

public class ConnectingCities {
    public static boolean canConnect(int n, int[][] connections) {
        DisjointSetUnion dsu = new DisjointSetUnion(n);
        for (int[] connection : connections) {
            if (connection == null || connection.length < 2) {
                continue;
            }
            dsu.union(connection[0], connection[1]);
        }
        int root = dsu.find(0);
        for (int i = 1; i < n; i++) {
            if (dsu.find(i) != root) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] edges = { {0, 1}, {1, 2}, {2, 3} };
        System.out.println(canConnect(4, edges));
    }
}
