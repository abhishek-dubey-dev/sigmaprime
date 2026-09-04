package oops;

public class CopyConstructor {
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

        // Copy Constructor
        Student(Student s) {
            this.name = s.name;
            this.roll = s.roll;
            this.marks = s.marks;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 101, 95.5f);
        Student s2 = new Student(s1); // Using copy constructor

        System.out.println("Student 1: " + s1.name + ", Roll: " + s1.roll + ", Marks: " + s1.marks);
        System.out.println("Student 2: " + s2.name + ", Roll: " + s2.roll + ", Marks: " + s2.marks);
    }
}
