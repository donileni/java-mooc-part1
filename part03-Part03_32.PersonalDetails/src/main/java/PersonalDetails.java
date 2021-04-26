
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totBirthYear = 0;
        int nameLength = 0; 
        String longestName = "";
        
        
        ArrayList<String> nameAndAge = new ArrayList<>(); 
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            
            nameAndAge.add(input);
            
        }
        
        for (String input: nameAndAge){
            String[] sepNameAndAge = input.split(",");
            String name = sepNameAndAge[0];
            int age = Integer.valueOf(sepNameAndAge[1]);
            
            totBirthYear += age;
            if (nameLength < name.length()){
                nameLength = name.length();
                longestName = name;
                 
            }
            
        }
        
        double averageBirth = ((1.0 * totBirthYear) / nameAndAge.size());
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + averageBirth);


    }
}
