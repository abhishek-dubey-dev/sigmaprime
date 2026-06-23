import java.util.Scanner;

public class TotalCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of the pencil:");
        float pencilPrice = sc.nextFloat();

        System.out.println("Enter the price of the pen:");
        float penPrice = sc.nextFloat();

        System.out.println("Enter the price of the eraser:");
        float eraserPrice = sc.nextFloat();

        float totalCost = pencilPrice + penPrice + eraserPrice;
        System.out.println("The total cost is: " + totalCost);
        sc.close();
    }
}
