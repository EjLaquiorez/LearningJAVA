import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            // Guard Clause
            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
                return;
            }

            int factorial = 1;

            for (int i = n; i >= 1; i--) {
                factorial *= i;

                if (i > 1) {
                    System.out.print(i + " x ");
                } else {
                    System.out.print(i);
                }
            }

            System.out.println(" = " + factorial);
        }
    }
}