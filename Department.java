import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentId;
    private String departmentName;
    private List<Course> courses;

    public Department(String departmentId,
                      String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(Course course) {
        if (courses.contains(course))
            return false;

        courses.add(course);
        return true;
    }

    public String getDepartmentInfo() {
        return "Department: " + departmentName
            + " (" + departmentId + ")";
    }
}