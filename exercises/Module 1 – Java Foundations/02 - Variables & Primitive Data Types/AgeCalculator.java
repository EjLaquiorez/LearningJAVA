
import java.util.Scanner;
public class AgeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== AGE CALCULATOR =====");
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "!");
        System.out.println("You are currently " + age + " years old.");
        System.out.println("Next year you will be " + (age + 1) + ".");
        System.out.println("In 10 years you will be " + (age + 10) + ".");  

        scanner.close();
    }
}

