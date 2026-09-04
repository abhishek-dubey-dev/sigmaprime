package oops;

public class HybridInheritance {
    private String name;
    private int roll;
    private float marks;

    private String department;
    private String college;
    private String university;

    public HybridInheritance(String name, int roll, float marks, String department, String college,
            String university) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.department = department;
        this.college = college;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public float getMarks() {
        return marks;
    }

    public String getDepartment() {
        return department;
    }

    public String getCollege() {
        return college;
    }

    public String getUniversity() {
        return university;
    }

    public static void main(String[] args) {
        HybridInheritance student = new HybridInheritance("John", 101, 95.5f, "Computer Science", "ABC College",
                "XYZ University");

        System.out.println("Student: " + student.getName() + ", Roll: " + student.getRoll() + ", Marks: "
                + student.getMarks() + ", Department: " + student.getDepartment() + ", College: "
                + student.getCollege() + ", University: " + student.getUniversity());
    }
}
