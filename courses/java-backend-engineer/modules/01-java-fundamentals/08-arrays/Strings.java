import java.util.Scanner;

public class Strings {

    private static final Scanner SCANNER = new Scanner(System.in);

    private static final String MY_NAME = "Justine";
    private static final String PASSWORD = "password123";

    private static final String[] STUDENTS = {
            "Alice",
            "Bob",
            "Charlie",
            "David",
            "Jas"
    };

    public static void main(String[] args) {

        System.out.println("Length: " + getLength(MY_NAME));

        printUpperCase(MY_NAME);
        printLowerCase(MY_NAME);
        printCharactersSeparately(MY_NAME);
        printReverse(MY_NAME);

        System.out.println("Vowels: " + countVowels(MY_NAME));
        System.out.println("Consonants: " + countConsonants(MY_NAME));

        System.out.println("Palindrome: " + isPalindrome("Level"));

        System.out.println("Letter 'a': " + countLetter(MY_NAME, 'a'));

        validatePassword("password123");

        System.out.println(searchStudent("Jas"));

        System.out.println(removeSpaces("I love Java Programming"));
    }

    // -----------------------------
    // Basic String Methods
    // -----------------------------

    public static int getLength(String text) {
        return text.length();
    }

    public static void printUpperCase(String text) {
        System.out.println("Uppercase: " + text.toUpperCase());
    }

    public static void printLowerCase(String text) {
        System.out.println("Lowercase: " + text.toLowerCase());
    }

    public static void printCharactersSeparately(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void printReverse(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
    }

    // -----------------------------
    // Counting
    // -----------------------------

    public static int countVowels(String text) {

        int count = 0;

        for (char c : text.toLowerCase().toCharArray()) {

            if ("aeiou".indexOf(c) != -1) {
                count++;
            }

        }

        return count;
    }

    public static int countConsonants(String text) {

        int count = 0;

        for (char c : text.toLowerCase().toCharArray()) {

            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) {
                count++;
            }

        }

        return count;
    }

    public static int countLetter(String text, char target) {

        int count = 0;

        target = Character.toLowerCase(target);

        for (char c : text.toLowerCase().toCharArray()) {

            if (c == target) {
                count++;
            }

        }

        return count;
    }

    // -----------------------------
    // Validation
    // -----------------------------

    public static boolean isPalindrome(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += Character.toLowerCase(word.charAt(i));
        }

        return reversed.equalsIgnoreCase(word);
    }

    public static void validatePassword(String input) {

        if (PASSWORD.equals(input)) {
            System.out.println("Password is correct");
        } else {
            System.out.println("Incorrect Password");
        }

    }

    // -----------------------------
    // Search
    // -----------------------------

    public static boolean searchStudent(String name) {

        for (String student : STUDENTS) {

            if (student.equalsIgnoreCase(name)) {
                return true;
            }

        }

        return false;
    }

    // -----------------------------
    // Utilities
    // -----------------------------

    public static String removeSpaces(String text) {
        return text.replace(" ", "");
    }

}