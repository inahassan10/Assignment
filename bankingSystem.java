import java.util.Scanner;

public class bankingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0;
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Amount to deposit: ");
                double amount = input.nextDouble();
                balance += amount;
                System.out.println("Deposited $" + amount);
            } else if (choice == 2) {
                System.out.print("Amount to withdraw: ");
                double amount = input.nextDouble();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrew $" + amount);
                } else {
                    System.out.println("Not enough funds.");
                }
            } else if (choice == 3) {
                System.out.println("Balance: $" + balance);
            } else if (choice == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}
