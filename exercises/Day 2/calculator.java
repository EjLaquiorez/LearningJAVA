import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== CALCULATOR =====");
        System.out.print("Enter First number: ");
        int Fnumber = scanner.nextInt();

        System.out.print("Enter Second number: ");
        int Snumber = scanner.nextInt();

        System.out.println("Sum: " + (Fnumber + Snumber));
        System.out.println("Difference: " + (Fnumber - Snumber));
        System.out.println("Product: " + (Fnumber * Snumber));
        System.out.println("Quotient: " + (Fnumber / Snumber));
        System.out.println("Remainder: " + (Fnumber % Snumber));
        scanner.close();

        System.out.println("===== CALCULATOR =====");
    }
}

