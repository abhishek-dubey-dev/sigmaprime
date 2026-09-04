package oops;

public class HierarchialInheritance {
    private String name;
    private int roll;

    private float marks;

    // Constructor
    public HierarchialInheritance(String name, int roll, float marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
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

    public static class ScienceStudent extends HierarchialInheritance {
        private String scienceSubject;

        // Constructor
        public ScienceStudent(String name, int roll, float marks, String scienceSubject) {
            super(name, roll, marks);
            this.scienceSubject = scienceSubject;
        }

        public String getScienceSubject() {
            return scienceSubject;
        }
    }

    public static class ArtsStudent extends HierarchialInheritance {
        private String artsSubject;

        // Constructor
        public ArtsStudent(String name, int roll, float marks, String artsSubject) {
            super(name, roll, marks);
            this.artsSubject = artsSubject;
        }

        public String getArtsSubject() {
            return artsSubject;
        }
    }

    public static void main(String[] args) {
        ScienceStudent scienceStudent = new ScienceStudent("John", 101, 95.5f, "Physics");
        ArtsStudent artsStudent = new ArtsStudent("Alice", 102, 89.0f, "History");

        System.out.println("Science Student: " + scienceStudent.getName() + ", Roll: " + scienceStudent.getRoll()
            + ", Marks: " + scienceStudent.getMarks() + ", Subject: " + scienceStudent.getScienceSubject());
        System.out.println("Arts Student: " + artsStudent.getName() + ", Roll: " + artsStudent.getRoll()
            + ", Marks: " + artsStudent.getMarks() + ", Subject: " + artsStudent.getArtsSubject());
    }

    
}
