import java.util.Scanner;

public class MenuSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
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

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Checking balance...");
            } else if (choice == 2) {
                System.out.println("Depositing funds...");
            } else if (choice == 3) {
                System.out.println("Withdrawing funds...");
            } else if (choice == 4) {
                System.out.println("Exiting...");
                running = false;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
            System.out.println();
        }

        scanner.close();
    }
}

