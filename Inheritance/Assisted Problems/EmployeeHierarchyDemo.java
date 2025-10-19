class EmployeeBase {
    String name;
    int id;
    double salary;

    EmployeeBase(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class ManagerEmployee extends EmployeeBase {
    int teamSize;

    ManagerEmployee(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class DeveloperEmployee extends EmployeeBase {
    String programmingLanguage;

    DeveloperEmployee(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class InternEmployee extends EmployeeBase {
    int internshipMonths;

    InternEmployee(String name, int id, double salary, int internshipMonths) {
        super(name, id, salary);
        this.internshipMonths = internshipMonths;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipMonths + " months");
    }
}

public class EmployeeHierarchyDemo {
    public static void main(String[] args) {
        EmployeeBase manager = new ManagerEmployee("Alice", 101, 90000, 5);
        EmployeeBase developer = new DeveloperEmployee("Bob", 102, 70000, "Java");
        EmployeeBase intern = new InternEmployee("Charlie", 103, 20000, 6);

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
