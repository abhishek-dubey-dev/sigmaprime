package heap;

import java.util.PriorityQueue;

public class PriorityQueueForObjects {
    private static class Student implements Comparable<Student> {
        private final String name;
        private final int marks;

        private Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student other) {
            return Integer.compare(marks, other.marks);
        }

        @Override
        public String toString() {
            return name + " (" + marks + " marks)";
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>();
        students.offer(new Student("Aman", 80));
        students.offer(new Student("Kiran", 75));
        students.offer(new Student("Riya", 90));

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
    }
}