package backtracking;

public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } else if (i == n || j == m) { // boundary cross condition
            return 0;
        }

        // recursion
        int downWays = gridWays(i + 1, j, n, m);
        int rightWays = gridWays(i, j + 1, n, m);
        return downWays + rightWays;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
