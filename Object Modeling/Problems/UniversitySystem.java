import java.util.ArrayList;

class Course1 {
    String courseName;
    Professor professor;
    ArrayList<Student1> students = new ArrayList<>();

    Course1(String courseName) {
        this.courseName = courseName;
    }

    void assignProfessor(Professor prof) {
        this.professor = prof;
        System.out.println(prof.name + " assigned to teach " + courseName);
    }

    void enrollStudent(Student1 student) {
        students.add(student);
        System.out.println(student.name + " enrolled in " + courseName);
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) System.out.println("Taught by: " + professor.name);
        System.out.println("Enrolled students:");
        for (Student1 s : students) {
            System.out.println("- " + s.name);
        }
    }
}

class Student1 {
    String name;
    ArrayList<Course1> courses = new ArrayList<>();

    Student1(String name) {
        this.name = name;
    }

    void enrollCourse(Course1 course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    void showCourses() {
        System.out.println("Student: " + name + " enrolled in:");
        for (Course1 c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course1 course) {
        course.assignProfessor(this);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Alice");
        Student1 s2 = new Student1("Bob");

        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        Course1 c1 = new Course1("Mathematics");
        Course1 c2 = new Course1("Physics");

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        s1.showCourses();
        s2.showCourses();

        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
