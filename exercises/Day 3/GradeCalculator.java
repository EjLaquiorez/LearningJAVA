import java.util.Scanner;   

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your grade (0-100):");
        int grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("Your Grade is: A");
        } else if (grade >= 80) {
            System.out.println("Your Grade is: B");
        } else if (grade >= 70) {
            System.out.println("Your Grade is: C");
        } else {
            System.out.println("Your Grade is: F");
        }
        scanner.close();
    }
}
