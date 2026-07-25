import java.util.Scanner;
public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 1000.00;
        System.out.println("===== ATM WITHDRAWAL =====");
        System.out.println("Enter withdrawl amount: ");
        double withdrawlAmount = scanner.nextDouble();

        if (withdrawlAmount <= balance) {
            balance -= withdrawlAmount;
            System.out.println("Withdrawal successful! Your new balance is: $" + balance);
        } else {
            System.out.println("Insufficient funds! Your current balance is: $" + balance);
        }

        scanner.close();
    }
}
