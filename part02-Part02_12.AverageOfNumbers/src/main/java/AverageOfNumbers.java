
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nrNumbers = 0;
        double sumNumbers = 0; 
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine()); 
            
            if (input == 0) { 
                break; 
            }
            
            if (input < 0 || input > 0) { 
                nrNumbers = (nrNumbers + 1); 
                sumNumbers = (sumNumbers + input);
                
            }
        }
        double average =  sumNumbers / nrNumbers;
        
        System.out.println("Average of the numbers: " + average);

    }
}
