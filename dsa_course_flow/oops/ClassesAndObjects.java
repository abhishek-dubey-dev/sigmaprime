package oops;

public class ClassesAndObjects {

    public static class Student {
        String name;
        int roll;
        float marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.roll = 101;
        s1.marks = 95.5f;

        Student s2 = new Student();
        s2.name = "Alice";
        s2.roll = 102;
        s2.marks = 89.0f;

        System.out.println("Student 1: " + s1.name + ", Roll: " + s1.roll + ", Marks: " + s1.marks);
        System.out.println("Student 2: " + s2.name + ", Roll: " + s2.roll + ", Marks: " + s2.marks);
    }

}