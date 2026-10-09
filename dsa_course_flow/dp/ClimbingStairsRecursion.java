package dp;

public class ClimbingStairsRecursion {
    public static long countWays(int stairs) {
        if (stairs < 0) {
            return 0;
        }
        if (stairs <= 1) {
            return 1;
        }
        return countWays(stairs - 1) + countWays(stairs - 2);
    }

    public static void main(String[] args) {
        System.out.println("Ways to climb 5 stairs: " + countWays(5));
    }
}
