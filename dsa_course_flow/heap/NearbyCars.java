package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class NearbyCars {
    static class CarDistance {
        int carId;
        int distance;

        CarDistance(int carId, int distance) {
            this.carId = carId;
            this.distance = distance;
        }
    }

    public static ArrayList<Integer> nearestCars(int[] positions, int k) {
        PriorityQueue<CarDistance> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b.distance, a.distance));

        for (int i = 0; i < positions.length; i++) {
            maxHeap.offer(new CarDistance(i, positions[i]));
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll().carId);
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] positions = {3, 6, 7, 12, 19};
        System.out.println(nearestCars(positions, 3));
    }
}
