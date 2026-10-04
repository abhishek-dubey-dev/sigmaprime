package greedy;

public class IndianCoins {
    public static int minimumCoins(int amount) {
        int[] coins = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;

        for (int coin : coins) {
            while (amount >= coin) {
                amount -= coin;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int amount = 590;
        System.out.println("Minimum number of coins for " + amount + ": "
                + minimumCoins(amount));
    }
}
