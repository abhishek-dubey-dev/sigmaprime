package graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FloodFillAlgorithm {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image.length == 0 || image[0].length == 0) {
            return image;
        }
        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }

        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] { sr, sc });
        int[][] directions = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };

        while (!queue.isEmpty()) {
            int[] cell = queue.removeFirst();
            int row = cell[0];
            int col = cell[1];
            if (row < 0 || row >= image.length || col < 0 || col >= image[0].length) {
                continue;
            }
            if (image[row][col] != oldColor) {
                continue;
            }
            image[row][col] = newColor;
            for (int[] dir : directions) {
                int nextRow = row + dir[0];
                int nextCol = col + dir[1];
                if (nextRow >= 0 && nextRow < image.length && nextCol >= 0 && nextCol < image[0].length && image[nextRow][nextCol] == oldColor) {
                    queue.addLast(new int[] { nextRow, nextCol });
                }
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = { {1, 1, 1}, {1, 1, 0}, {1, 0, 1} };
        int[][] result = floodFill(image, 1, 1, 2);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
