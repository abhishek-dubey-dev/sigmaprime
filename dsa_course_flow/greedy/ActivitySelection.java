package greedy;

public class ActivitySelection {
    // Activities must be sorted by finish time.
    public static int maxActivities(int[] start, int[] finish) {
        if (start.length == 0) {
            return 0;
        }
        int count = 1;
        int lastActivity = 0;

        for (int i = 1; i < start.length; i++) {
            if (start[i] >= finish[lastActivity]) {
                count++;
                lastActivity = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};
        System.out.println("Maximum activities: " + maxActivities(start, finish));
    }
}
