class BankAccountBase {
    String accountNumber;
    double balance;

    BankAccountBase(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccountInfo extends BankAccountBase {
    double interestRate;

    SavingsAccountInfo(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account - Account Number: " + accountNumber + ", Balance: " + balance +
                ", Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccountInfo extends BankAccountBase {
    double withdrawalLimit;

    CheckingAccountInfo(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account - Account Number: " + accountNumber + ", Balance: " + balance +
                ", Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccountInfo extends BankAccountBase {
    int depositTerm; // in months

    FixedDepositAccountInfo(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account - Account Number: " + accountNumber + ", Balance: " + balance +
                ", Deposit Term: " + depositTerm + " months");
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccountInfo sa = new SavingsAccountInfo("SA123", 50000, 5);
        CheckingAccountInfo ca = new CheckingAccountInfo("CA456", 30000, 10000);
        FixedDepositAccountInfo fd = new FixedDepositAccountInfo("FD789", 100000, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fd.displayAccountType();
    }
}
