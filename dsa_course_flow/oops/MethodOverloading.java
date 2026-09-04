package oops;

public class MethodOverloading {
    private String name;

    private int roll;
    private float marks;

    // Method to set student details
    public void setDetails(String name, int roll, float marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // Overloaded method to set student details with only name and roll
    public void setDetails(String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.marks = 0.0f; // Default marks
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        MethodOverloading student1 = new MethodOverloading();
        student1.setDetails("John", 101, 95.5f);
        student1.displayDetails();

        MethodOverloading student2 = new MethodOverloading();
        student2.setDetails("Alice", 102);
        student2.displayDetails();
    }
}
