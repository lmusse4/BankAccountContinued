import java.util.Scanner;
public class BankAccountTwo {
    private double balance;
    private String accountHolderName;
    private int accountNumber;

    public BankAccountTwo (double balance, String accountHolderName) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BankAccountTwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey there! Welcome to the Bank of Lani");
        System.out.print("What is the name for the account?: ");
        this.accountHolderName = scanner.nextLine();
        System.out.print("What is the beginning balance?: ");
        this.balance = scanner.nextDouble();
        scanner.nextLine();
    }


    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Not enough funds.");
        }
    }

    public void transfer(BankAccountTwo toAccount, double amount) {
        if (this.balance >= amount) {
            this.withdrawal(amount);
            toAccount.deposit(amount);
        } else {
            System.out.println("Not enough funds for transfer.");
        }
    }



    public void printAccountDetails() {
        System.out.println("Account holder's name: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account balance: $" + balance);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}