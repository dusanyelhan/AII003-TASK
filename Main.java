public class Main {
    public static void main(String[] args) {

        Department department = new Department(
            "SE", "Software Engineering"
        );

        Course course1 = new Course(
            "SE301", "Software Engineering", 3
        );

        Course course2 = new Course(
            "SE302", "Object Oriented Design", 3
        );

        department.addCourse(course1);
        department.addCourse(course2);

        Student student = new Student(
            "20231045",
            "Yelhan Yangelkan",
            "student@example.com",
            department
        );

        student.updateGpa(3.5f);
        student.enrollInCourse(course1);
        student.enrollInCourse(course2);

        System.out.println(student.getStudentInfo());
        System.out.println();
        System.out.println(course1.getCourseInfo());

        student.dropCourse(course2);

        System.out.println("\nAfter dropping a course:");
        System.out.println(student.getStudentInfo());
    }
}