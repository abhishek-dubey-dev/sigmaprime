package oops;

public class Encapsulation {
    public static class Student {
        private String name;
        private int roll;
        private float marks;

        // Getter and Setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for roll
        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        // Getter and Setter for marks
        public float getMarks() {
            return marks;
        }

        public void setMarks(float marks) {
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        s1.setRoll(101);
        s1.setMarks(95.5f);

        Student s2 = new Student();
        s2.setName("Alice");
        s2.setRoll(102);
        s2.setMarks(89.0f);

        System.out.println("Student 1: " + s1.getName() + ", Roll: " + s1.getRoll() + ", Marks: " + s1.getMarks());
        System.out.println("Student 2: " + s2.getName() + ", Roll: " + s2.getRoll() + ", Marks: " + s2.getMarks());
    }
}
