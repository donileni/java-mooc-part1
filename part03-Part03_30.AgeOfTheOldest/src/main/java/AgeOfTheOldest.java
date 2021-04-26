
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        ArrayList<String> nameAndAge = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            nameAndAge.add(input);

        }
        
        
        for (String input: nameAndAge){
            String[] sepNameAndAge = input.split(",");
            String name = sepNameAndAge[0];
            int age = Integer.valueOf(sepNameAndAge[1]);
            if (oldest < age){
                oldest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}
