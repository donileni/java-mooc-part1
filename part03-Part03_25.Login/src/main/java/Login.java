
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter usename: ");
        String usernameInput = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String passwordInput = scanner.nextLine(); 
        
        String username = "alex";
        String password = "sunshine";
        
        String username2 = "emma";
        String password2 = "haskell";
        
        if (usernameInput.equals(username) && passwordInput.equals(password)){
            System.out.println("You have successfully logged in!");
        } else if (usernameInput.equals(username2) && passwordInput.equals(password2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username and password!");
        }
        

    }
}
