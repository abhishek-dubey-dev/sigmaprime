package graphs;

import java.util.Arrays;

public class CheapestFlightsWithinKStops {
    public static int cheapestFlight(int n, int[][] flights, int src, int dst, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE / 4);
        dp[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] next = Arrays.copyOf(dp, n);
            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int cost = flight[2];
                if (dp[from] != Integer.MAX_VALUE / 4 && dp[from] + cost < next[to]) {
                    next[to] = dp[from] + cost;
                }
            }
            dp = next;
        }
        return dp[dst] == Integer.MAX_VALUE / 4 ? -1 : dp[dst];
    }

    public static void main(String[] args) {
        int[][] flights = { {0, 1, 100}, {1, 2, 100}, {0, 2, 500} };
        System.out.println(cheapestFlight(3, flights, 0, 2, 1));
    }
}
