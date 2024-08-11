
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private Map<String, Double> accounts = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("1.	Create Account");
            System.out.println("2.	Deposit");
            System.out.println("3.	Withdraw");
            System.out.println("4.	Check Balance");
            System.out.println("5.	Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void createAccount() {
        System.out.print("Enter account name: ");
        String accountName = scanner.next();
        accounts.put(accountName, 0.0);
        System.out.println("Account created successfully!");
    }

    private void deposit() {
        System.out.print("Enter account name: ");
        String accountName = scanner.next();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        accounts.put(accountName, accounts.get(accountName) + amount);
        System.out.println("Deposit successful!");
    }

    private void withdraw() {
        System.out.print("Enter account name: ");
        String accountName = scanner.next();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (accounts.get(accountName) >= amount) {
            accounts.put(accountName, accounts.get(accountName) - amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    private void checkBalance() {
        System.out.print("Enter account name: ");
        String accountName = scanner.next();
        System.out.println("Balance: " + accounts.get(accountName));
    }

    public static void main(String[] args) {
       Main bankingSystem = new Main();
        bankingSystem.run();
    }
}
