class PersonBase {
    String name;
    int age;

    PersonBase(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class TeacherRole extends PersonBase {
    String subject;

    TeacherRole(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Teacher - Name: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}

class StudentRole extends PersonBase {
    String grade;

    StudentRole(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Student - Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

class StaffRole extends PersonBase {
    String department;

    StaffRole(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Staff - Name: " + name + ", Age: " + age + ", Department: " + department);
    }
}

public class SchoolHierarchyDemo {
    public static void main(String[] args) {
        TeacherRole teacher = new TeacherRole("Mrs. Sharma", 35, "Math");
        StudentRole student = new StudentRole("Aryan", 16, "10th");
        StaffRole staff = new StaffRole("Mr. Verma", 40, "Maintenance");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
