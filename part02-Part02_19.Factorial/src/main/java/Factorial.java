
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int i = Integer.valueOf(scanner.nextLine()); 
        
        int factorial = 1; 
        int num = 1; 
        
        while (num <= i){
            factorial *=num;
            num++;
            
        }
        
        System.out.println("Factorial: " + factorial);

    }
}
