package Lab_03_Tasks;

public class Course {
    String courseCode;
    String courseName;
    int creditHours;

    Course() {
        courseCode = "Unknown Code";
        courseName = "Unknown Name";
        creditHours = 0;
    }

    Course(String code, String name, int crdHrs) {
        this.courseCode = code;
        this.courseName = name;
        this.creditHours = crdHrs;
    }

    void display() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
    }

    public static void main(String[] args) {
        Course course1 = new Course();
        course1.display();
        Course course2 = new Course("CS101", "OOP", 3);
        course2.display();
        Course course3 = new Course("EE202", "DLD", 2);
        course3.display();
    }
}
