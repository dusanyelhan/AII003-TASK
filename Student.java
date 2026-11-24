import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private String email;
    private float gpa;
    private Department department;
    private List<Course> enrolledCourses;

    public Student(String studentId, String name,
                   String email, Department department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
        this.gpa = 0;
        this.enrolledCourses = new ArrayList<>();
    }

    public boolean enrollInCourse(Course course) {
        if (enrolledCourses.contains(course))
            return false;

        enrolledCourses.add(course);
        course.addStudent(this);
        return true;
    }

    public boolean dropCourse(Course course) {
        if (!enrolledCourses.remove(course))
            return false;

        course.removeStudent(this);
        return true;
    }

    public void updateGpa(float newGpa) {
        if (newGpa >= 0 && newGpa <= 4)
            this.gpa = newGpa;
    }

    public String getStudentInfo() {
        return "Student ID: " + studentId
            + "\nName: " + name
            + "\nEmail: " + email
            + "\nGPA: " + gpa
            + "\n" + department.getDepartmentInfo()
            + "\nEnrolled Courses: "
            + enrolledCourses.size();
    }
}