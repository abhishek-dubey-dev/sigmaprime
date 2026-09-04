package oops;

public class GettersAndSetters {
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

    public static void main(String[] args) {
        GettersAndSetters student = new GettersAndSetters();
        student.setName("John");
        student.setRoll(101);
        student.setMarks(95.5f);

        System.out.println(
                "Student: " + student.getName() + ", Roll: " + student.getRoll() + ", Marks: " + student.getMarks());
    }
}
