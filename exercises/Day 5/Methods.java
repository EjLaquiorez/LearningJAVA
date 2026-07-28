
public class Methods{
public static void main(String[] args){

    int squareResult = square(4);
    int cubeResult = cube(5);

    boolean even = isEven(8);

    long fact = factorial(5);

    System.out.println("Square: " + squareResult);
    System.out.println("Cube: " + cubeResult);
    System.out.println("Is Even: " + even);
    System.out.println("Factorial: " + fact);

}

    public static int square(int n){
        return n * n;
    }

    public static int cube(int n){
        return n * n * n;

    }

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static long factorial(int n){
        // Guard Clause
        if (n < 0) {
            return -1;
        }

        long factorial = 1L;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }
}


