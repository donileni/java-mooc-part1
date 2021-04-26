
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nrNumbers = 0; 
        double sumNumbers = 0; 
        
        while (true) { 
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) { 
                break;
            }
            
            if (input > 0) {
                nrNumbers = (nrNumbers + 1);
                sumNumbers = (sumNumbers + input); 
            }
           
        }
        if (nrNumbers == 0) {
            System.out.println("Cannot calculate the average");
        } else { 
            double average = (sumNumbers / nrNumbers);
            System.out.println(average);
            
        }

    }
}
