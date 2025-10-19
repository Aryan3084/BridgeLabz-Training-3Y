import java.util.ArrayList;

class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    void showEmployee() {
        System.out.println("Employee Name: " + name + ", Role: " + role);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.showEmployee();
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addEmployeeToDepartment(String deptName, String empName, String empRole) {
        for (Department d : departments) {
            if (d.deptName.equals(deptName)) {
                d.addEmployee(empName, empRole);
                break;
            }
        }
    }

    void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        company.addDepartment("IT");
        company.addDepartment("HR");

        company.addEmployeeToDepartment("IT", "Alice", "Developer");
        company.addEmployeeToDepartment("IT", "Bob", "Tester");
        company.addEmployeeToDepartment("HR", "Charlie", "Recruiter");

        company.showCompanyStructure();
    }
}
