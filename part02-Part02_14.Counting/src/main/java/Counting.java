
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.valueOf(scanner.nextLine()); 
        
        int start = 0; 
        
        for (int count = start; count <= input; count++) { 
            System.out.println(count);
        }
         
    }
}
