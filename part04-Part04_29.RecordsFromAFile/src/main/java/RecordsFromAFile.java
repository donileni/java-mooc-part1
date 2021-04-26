
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine(); 
        
        
        try (Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()){
                String lines = reader.nextLine(); 
                
                String[] parts = lines.split(",");
                String names = parts [0]; 
                int age = Integer.valueOf(parts[1]);
                
                if (age == 1){
                    System.out.println(names + ", age: " + age + " year");
                } else {
                    System.out.println(names + ", age: " + age + " years");
                }
            }
            
        } catch (Exception e){
            
        }

    }
}
