import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("Guess a number: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input.");
                    scanner.next();
                    continue;
                }

                int guess = scanner.nextInt();

                if (guess == 7) {
                    System.out.println("Correct!");
                    break;
                }

                System.out.println("Try again!");
            }
        }
    }
}