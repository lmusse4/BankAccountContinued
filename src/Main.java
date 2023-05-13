import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccountTwo> accounts = new ArrayList<>();


        for (BankAccountTwo account : accounts) {
            account.printAccountDetails();
        }
        for (BankAccountTwo account : accounts) {
            mainMenu(account);
        }
        BankAccountTwo account3 = new BankAccountTwo();
        accounts.add(account3);
        mainMenu(account3);




        BankAccountTwo account0 = new BankAccountTwo(500, "Leyla");
        BankAccountTwo account1 = new BankAccountTwo(5000, "Larry");
        BankAccountTwo account2 = new BankAccountTwo(300, "Mary");

        // withdraw $100 from account 1 and deposit it into account 2
        account0.deposit(100);
        account1.withdrawal(100);
        account2.deposit(100);

        account0.printAccountDetails();
        account1.printAccountDetails();
        account2.printAccountDetails();




    }

    public static void mainMenu(BankAccountTwo account) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome " + account.getAccountHolderName() + "! What would you like to do?");
        System.out.println("1. Check account balance");
        System.out.println("2. Make a deposit");
        System.out.println("3. Make a withdrawal");
        System.out.println("4. Transfer funds to another account");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Your current balance is: $" + account.getBalance());
                break;
            case 2:
                System.out.print("Enter amount to deposit: $");
                double depositAmount = scanner.nextDouble();
                scanner.nextLine();
                account.deposit(depositAmount);
                System.out.println("Deposit of $" + depositAmount + " successful. Your new balance is: $" + account.getBalance());
                break;
            case 3:
                System.out.print("Enter amount to withdraw: $");
                double withdrawalAmount = scanner.nextDouble();
                scanner.nextLine();
                account.withdrawal(withdrawalAmount);
                System.out.println("Withdrawal of $" + withdrawalAmount + " successful. Your new balance is: $" + account.getBalance());
                break;

            default:
                System.out.println("Invalid choice. Try again!");
                break;
        }
    }


}

