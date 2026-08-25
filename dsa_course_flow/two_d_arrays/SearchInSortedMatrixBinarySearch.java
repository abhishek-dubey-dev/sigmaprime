public class SearchInSortedMatrixBinarySearch {
       public static boolean binarySearch(int matrix[][], int key) {

        for (int row = 0; row < matrix.length; row++) {

            int start = 0;
            int end = matrix[row].length - 1;

            while (start <= end) {

                int mid = (start + end) / 2;

                if (matrix[row][mid] == key) {
                    System.out.println("Found key at (" + row + ", " + mid + ")");
                    return true;
                } 
                else if (key < matrix[row][mid]) {
                    end = mid - 1;
                } 
                else {
                    start = mid + 1;
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

        binarySearch(matrix, key);
    }
}
