
import java.util.ArrayList;
import java.util.Scanner;


public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner newScanner, SimpleDictionary newDictionary){
        this.scanner = newScanner;
        this.dictionary = newDictionary; 
    }
    
    public void start(){
        
        while (true){
            System.out.println("Enter command: ");
            String command = scanner.nextLine(); 
            
            if (command.equals("end")){
                System.out.println("Bye Bye!");
                break;
            }
            
            if (command.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            }
            
            else if (command.equals("search")){
                System.out.print("To be translated: ");
                String wordToTranslate = scanner.nextLine();
                String returnTranslation = this.dictionary.translate(wordToTranslate);
                if (returnTranslation == null){
                    System.out.println("Word " + wordToTranslate + " was not found");
                } else {
                    System.out.println("Translation: " + returnTranslation);
                }
                
            } else {
                System.out.println("Unknown command");
            }
            
        }
    }
    
}
