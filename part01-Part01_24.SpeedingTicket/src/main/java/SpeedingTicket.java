
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        
        System.out.println("Give speed:");
         int number = Integer.valueOf(scanner.nextLine()); 
         
         if (number > 120) {
             System.out.println("Speeding ticket!");
         }
       
         int hej = david.tjena();
         System.out.println(hej);
    }
}

 class david { 
    public static int tjena() {
        return 5;
    }
}