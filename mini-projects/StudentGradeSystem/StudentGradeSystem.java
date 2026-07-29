import java.util.Scanner;
public class StudentGradeSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int[] grades = new int[5];

    public static void main(String[] args) {
        userInput();
        gradeEvaluator();
    }

    public static void gradeEvaluator() {
        if (grades == null || grades.length == 0) {
            System.out.println("No grades to evaluate.");
            return;
        }

        int highest = grades[0];
        int lowest = grades[0];
        int total = 0;
        int passed = 0;
        int failed = 0;

        System.out.println("===== REPORT =====");
        System.out.println("Grades");
        for (int grade : grades) {
            System.out.println(grade);
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            if (grade >= 75) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = total / (double) grades.length;

        System.out.println("Highest");
        System.out.println(highest);
        System.out.println("Lowest");
        System.out.println(lowest);
        System.out.println("Average");
        System.out.println(average);
        System.out.println("Passed");
        System.out.println(passed);
        System.out.println("Failed");
        System.out.println(failed);
    }

    public static void userInput() {
        System.out.println("Enter 5 grades:");
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        scanner.nextLine();
    }
    
}
