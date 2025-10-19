import java.util.ArrayList;

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s account balance: $" + balance);
    }
}

class Bank {
    String bankName;
    ArrayList<Customer> customers = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer) {
        customers.add(customer);
        System.out.println(customer.name + " has opened an account at " + bankName);
    }

    void showAllCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.name);
        }
    }
}

public class BankCustomerDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("City Bank");

        Customer c1 = new Customer("Alice", 1500.0);
        Customer c2 = new Customer("Bob", 2300.0);

        bank.openAccount(c1);
        bank.openAccount(c2);

        System.out.println();
        bank.showAllCustomers();
        System.out.println();

        c1.viewBalance();
        c2.viewBalance();
    }
}
