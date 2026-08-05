import java.util.Scanner;
public class MathTool {


    public static int cube(int a){
        return a * a * a;
    }

    public static int square(int a){
        return a * a;
    }

    public static int factorial(int a){
        if(a < 0){
            throw new IllegalArgumentException("Factorial is undefined in negative numbers.");
        }

        int result = 1;
        for(int i = 2; i <= a; i++){
            result*=i;
        }
        return result;
    }

    public static double areaOfCircle(double radius) {
    return Math.PI * Math.pow(radius, 2);
}

    public static boolean IsEven(int a){
        return a % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println("===========MATH TOOL===========");
        System.out.println("1. Square\n2. Cube\n3. Factorial\n4. Is Even\n5. Area of Circle\n6. Exit");
        System.out.println("Choose 1 - 6");
        try(Scanner scanner = new Scanner(System.in)){
            int choice = scanner.nextInt();

            if(choice == 1){
                System.out.print("Enter a number: ");
                int num1 = scanner.nextInt();
                System.out.println(square(num1));
            }
            else if(choice == 2){
                System.out.print("Enter a number: ");
                int num1 = scanner.nextInt();
                System.out.println(cube(num1));
            }
            else if(choice == 3){
                System.out.print("Enter a number: ");
                int num1 = scanner.nextInt();
                System.out.println(factorial(a));
            }
            else if(choice == 4){
                System.out.print("Enter a number: ");
                int num1 = scanner.nextInt();
                if(num1 > 0){
                    System.out.println(IsEven(num1));
                }
            }
            else if(choice == 5){
                System.out.print("Enter a number: ");
                int num1 = scanner.nextInt();
                System.out.println(areaOfCircle(num1));
            }
            else{
                System.out.println("Exiting....");
            }
        }
    }
}

