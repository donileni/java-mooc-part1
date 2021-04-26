
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine()); 
        
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine()); 
        
        int plusResultat = first + second;
        int minusResultat = first - second;
        int multiResultat = first * second;
        double divResultat = (1.0 * first) / second;

        System.out.println( first + " + " + second + " = " + plusResultat);
        System.out.println(first + " - " + second + " = " + minusResultat);
        System.out.println(first + " * " + second + " = " + multiResultat); 
        System.out.println(first + " / " + second + " = " + divResultat);

    }
}
