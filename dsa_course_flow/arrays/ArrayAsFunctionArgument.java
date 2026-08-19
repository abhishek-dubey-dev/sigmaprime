public class ArrayAsFunctionArgument {

    public static void updateArray(int marks[]) {
        for (int i = 0; i < 3; i++) {
            marks[i] = marks[i] + 10;
        }
    }

    public static void main(String[] args) {
        int marks[] = new int[50];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;

        System.out.println("Before passing to function: ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        updateArray(marks);

        System.out.println("After passing to function: ");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}
