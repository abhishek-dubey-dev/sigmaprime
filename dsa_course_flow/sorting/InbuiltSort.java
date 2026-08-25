import java.util.Arrays;

public class InbuiltSort {

    public static void sort(int arr[]) {
        Arrays.sort(arr);
    }

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        sort(arr);

        printArr(arr);
    }
}

