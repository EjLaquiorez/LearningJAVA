public class PrintName {

    public static String greet(String name) {
        return name;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static boolean isPositive(int value) {
        return value > 0;
    }


    public static int maximum(int a, int b){
        return a > b ? a : b;
    }

        public static int minimum(int a, int b){
        return a < b ? a : b;
    }

    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public static String countCharacters(String text){
        return String.valueOf(text.length());
    }

    public static boolean reverseBoolean(boolean value){
        return !value;
    }

public static int power(int base, int exponent) {
    if (exponent < 0) {
        throw new IllegalArgumentException("Exponent cannot be negative.");
    }

    int result = 1;

    while (exponent > 0) {
        if ((exponent & 1) == 1) {
            result *= base;
        }
        base *= base;
        exponent >>= 1;
    }

    return result;
}

    public static void main(String[] args) {
        // Demonstrate available methods
        System.out.println(greet("Hello, Justine!"));
        System.out.println("multiply(3,4) = " + multiply(3,4));
        System.out.println("isPositive(-5) = " + isPositive(-5));
        System.out.println("maximum(10,7) = " + maximum(10,7));
        System.out.println("minimum(10,7) = " + minimum(10,7));
        System.out.println("calculateArea(2.5) = " + calculateArea(2.5));
        System.out.println("countCharacters(\"abcde\") = " + countCharacters("abcde"));
        System.out.println("reverseBoolean(true) = " + reverseBoolean(true));
        System.out.println("power(2,10) = " + power(2,10));
    }
}
