import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Password");
        String password = scanner.nextLine();
        scanner.close();

        int score = 0;
        if (hasUppercase(password)) score++;
        if (hasLowercase(password)) score++;
        if (hasDigit(password)) score++;
        if (isLongEnough(password)) score++;

        displayInput(password, score);
    }

    public static boolean hasUppercase(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLowercase(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDigit(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isLongEnough(String text) {
        return text.length() >= 8;
    }

    public static void displayInput(String text, int score) {
        System.out.println("Password: " + text);
        System.out.println("Score: " + score);
        if (score == 4) {
            System.out.println("Strong");
        } else if (score == 3) {
            System.out.println("Medium");
        } else {
            System.out.println("Weak");
        }
    }
}


