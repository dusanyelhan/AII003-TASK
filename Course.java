import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private List<Student> enrolledStudents;

    public Course(String courseCode,
                  String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.enrolledStudents = new ArrayList<>();
    }

    public boolean addStudent(Student student) {
        if (enrolledStudents.contains(student))
            return false;

        enrolledStudents.add(student);
        student.enrollInCourse(this);
        return true;
    }

    public boolean removeStudent(Student student) {
        if (!enrolledStudents.remove(student))
            return false;

        student.dropCourse(this);
        return true;
    }

    public String getCourseInfo() {
        return "Course: " + courseCode
            + " - " + courseName
            + "\nCredits: " + credits
            + "\nEnrolled Students: "
            + enrolledStudents.size();
    }
}