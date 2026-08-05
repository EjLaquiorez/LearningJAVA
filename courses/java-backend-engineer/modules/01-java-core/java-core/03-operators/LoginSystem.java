import java.util.Scanner;
public class LoginSystem { 
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String username = "admin";
            String password = "password123";

            System.out.println("===== LOGIN SYSTEM =====");
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login successful! Welcome, " + username + "!");
            } else {
                System.out.println("Login failed! Invalid username or password.");
            }
        }

        
    }
    
}
