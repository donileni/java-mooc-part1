
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Name Plzz?");
        String name = (scan.nextLine());
        System.out.println(name);
        int number = Integer.valueOf(name);
        System.out.println(number);
        
        if (name.equals("David")) {
            System.out.println("You are amazingt");
        } else {
            System.out.println("You are retard"); 
        }
    }
}
