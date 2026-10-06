package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Soldier {
        int strength;
        int index;

        Soldier(int strength, int index) {
            this.strength = strength;
            this.index = index;
        }
    }

    public static ArrayList<Integer> kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Soldier> heap = new PriorityQueue<>((a, b) -> {
            if (a.strength != b.strength) return Integer.compare(a.strength, b.strength);
            return Integer.compare(a.index, b.index);
        });

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) count++;
            }
            heap.add(new Soldier(count, i));
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (k-- > 0 && !heap.isEmpty()) {
            result.add(heap.poll().index);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1}
        };

        System.out.println(kWeakestRows(mat, 3));
    }
}
