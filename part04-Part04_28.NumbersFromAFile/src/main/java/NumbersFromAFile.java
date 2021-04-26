
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> listNumbers = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try (Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()){
                numbers.add(Integer.valueOf(reader.nextLine()));
                
            }
            
        } catch (Exception e) {
            
        }
        
        
        for (Integer number: numbers){
            if (number >= lowerBound && number <= upperBound){
                listNumbers.add(number);
            }
        }
        
        System.out.println("Numbers: " + listNumbers.size());
        
    } 
   

}
