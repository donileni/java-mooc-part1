
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister(); 
        
        UserInterface UI = new UserInterface(scanner, register);   
         
        UI.start();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
    }
}
