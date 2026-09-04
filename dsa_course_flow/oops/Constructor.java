package oops;

public class Constructor {
    public static class Student {
        String name;
        int roll;
        float marks;

        // Constructor
        Student(String name, int roll, float marks) {
            this.name = name;
            this.roll = roll;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 101, 95.5f);
        Student s2 = new Student("Alice", 102, 89.0f);

        System.out.println("Student 1: " + s1.name + ", Roll: " + s1.roll + ", Marks: " + s1.marks);
        System.out.println("Student 2: " + s2.name + ", Roll: " + s2.roll + ", Marks: " + s2.marks);
    }
}
