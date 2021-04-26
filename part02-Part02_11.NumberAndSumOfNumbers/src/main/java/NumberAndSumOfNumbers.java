
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nrNumbers = 0; 
        int sumNumbers = 0; 
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine()); 
            
            if (input == 0) { 
                break;
            }
            
            if (input < 0 || input >0) { 
                nrNumbers = (nrNumbers + 1);
                sumNumbers = (sumNumbers + input);
            }
        }
        
        System.out.println("Number of numbers: " + nrNumbers);
        System.out.println("Sum of the numbers: " + sumNumbers);

    }
}
