package greedy;

public class JobSequencingProblem {
    public static int maximumProfit(int[] deadlines, int[] profits) {
        int n = deadlines.length;
        int[][] jobs = new int[n][3]; // job number, deadline, profit

        for (int i = 0; i < n; i++) {
            jobs[i][0] = i + 1;
            jobs[i][1] = deadlines[i];
            jobs[i][2] = profits[i];
        }

        // Sort jobs by profit, from highest to lowest.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (jobs[i][2] < jobs[j][2]) {
                    int[] temp = jobs[i];
                    jobs[i] = jobs[j];
                    jobs[j] = temp;
                }
            }
        }

        int[] slots = new int[n];
        int totalProfit = 0;
        for (int[] job : jobs) {
            if (job[2] <= 0) {
                continue;
            }
            for (int slot = Math.min(n, job[1]) - 1; slot >= 0; slot--) {
                if (slots[slot] == 0) {
                    slots[slot] = job[0];
                    totalProfit += job[2];
                    break;
                }
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] deadlines = {4, 1, 1, 1};
        int[] profits = {20, 10, 40, 30};
        System.out.println("Maximum profit: " + maximumProfit(deadlines, profits));
    }
}
