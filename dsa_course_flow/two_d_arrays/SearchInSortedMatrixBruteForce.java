public class SearchInSortedMatrixBruteForce {
      public static boolean bruteForceSearch(int matrix[][], int key) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[0].length; col++) {

                if (matrix[row][col] == key) {
                    System.out.println("Found key at (" + row + ", " + col + ")");
                    return true;
                }
            }
        }

        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int key = 33;

        bruteForceSearch(matrix, key);
    }
}
