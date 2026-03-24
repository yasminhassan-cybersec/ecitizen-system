import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        final String correct_username = "adminKE";
        final String correct_password = "254Secure";
        
        // Create scanner for input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("eCITIZEN LOGIN VALIDATION SYSTEM");
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Validate credentials
        if (username.equals(correct_username) && password.equals(correct_password)) {
            System.out.println("Access Granted");
            System.out.println("Welcome to eCitizen Services!");
        } else {
            System.out.println("Invalid Credentials");
            System.out.println("Please check your username and password and try again.");
        }
        
        System.out.println("Thank you for using eCitizen Services");
        
        // Close scanner
        scanner.close();
    }
}