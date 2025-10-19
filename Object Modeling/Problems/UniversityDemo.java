import java.util.ArrayList;

class Faculty {
    String name;
    String designation;

    Faculty(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void showFaculty() {
        System.out.println("Faculty: " + name + ", " + designation);
    }
}

class Department1 {
    String deptName;
    ArrayList<Faculty> facultyMembers = new ArrayList<>();

    Department1(String deptName) {
        this.deptName = deptName;
    }

    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Faculty f : facultyMembers) {
            f.showFaculty();
        }
    }
}

class University {
    String uniName;
    ArrayList<Department1> departments = new ArrayList<>();

    University(String uniName) {
        this.uniName = uniName;
    }

    void addDepartment(Department1 dept) {
        departments.add(dept);
    }

    void showUniversity() {
        System.out.println("University: " + uniName);
        for (Department1 d : departments) {
            d.showDepartment();
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        // Faculty can exist independently
        Faculty f1 = new Faculty("Dr. Smith", "Professor");
        Faculty f2 = new Faculty("Dr. Johnson", "Associate Professor");

        Department1 d1 = new Department1("Computer Science");
        Department1 d2 = new Department1("Mathematics");

        d1.addFaculty(f1);
        d2.addFaculty(f2);

        University uni = new University("Global University");
        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.showUniversity();

        System.out.println("\nFaculty independent of any department:");
        Faculty f3 = new Faculty("Dr. Brown", "Lecturer");
        f3.showFaculty();
    }
}
