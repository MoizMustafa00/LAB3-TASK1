package Lab3;

public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double initialBalance;


    BankAccount() {
        System.out.println("Bank Account Created!");
    }

    BankAccount(int accNum, String accHolderName) {
        this.accountNumber = accNum;
        this.accountHolderName = accHolderName;
        this.initialBalance = 0;
    }

    BankAccount(int accNum, String accHolderName, double initBalance) {
        this.accountNumber = accNum;
        this.accountHolderName = accHolderName;
        this.initialBalance = initBalance;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber + "\nAccount Holder Name: " + accountHolderName + "\nInitial Balance: " + initialBalance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100, "Moiz", 10000);
        account1.display();
        BankAccount account2 = new BankAccount(200, "Taha");
        account2.display();
    }
}