import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Course: " + courseName + " has students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name + " is enrolled in courses:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("School has students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);

        s2.enrollInCourse(c1);

        school.showStudents();
        System.out.println();

        s1.showCourses();
        s2.showCourses();
        System.out.println();

        c1.showStudents();
        c2.showStudents();
    }
}
