import java.util.Scanner;

public class MenuSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean running = true;
    private static double balance = 0.0;

    public static void main(String[] args) {
        while (running) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> exitProgram();
                default -> System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void showMenu() {
        System.out.println("===== ATM =====");
        System.out.println();
        System.out.println("1. Check Balance");
        System.out.println();
        System.out.println("2. Deposit");
        System.out.println();
        System.out.println("3. Withdraw");
        System.out.println();
        System.out.println("4. Exit");
        System.out.print("Choose an option: ");
    }

    public static void checkBalance() {
        System.out.printf("Current balance: $%.2f%n", balance);
    }

    public static void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount <= 0) {
            System.out.println("Please enter a positive amount.");
            return;
        }

        balance += amount;
        System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, balance);
    }

    public static void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount <= 0) {
            System.out.println("Please enter a positive amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }

        balance -= amount;
        System.out.printf("Withdrew $%.2f. New balance: $%.2f%n", amount, balance);
    }

    public static void exitProgram() {
        System.out.println("Exiting...");
        running = false;
    }
}
