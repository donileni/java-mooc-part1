
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = Integer.valueOf(scanner.nextLine()); 
        
        if (sum < 0) { 
            System.out.println(sum * -1);
        } else { 
            System.out.println(sum);
        }
    }
}
