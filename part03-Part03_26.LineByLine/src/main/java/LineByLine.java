
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while (true) {
           String sentence = scanner.nextLine(); 
           String[] words = sentence.split(" "); 
           
           if (sentence.equals("")) {
               break;
           } else {
              for (int i = 0; i < words.length; i++){
                  String newLineWords = words[i]; 
                  System.out.println(words[i]);
              }
              
            }
        
        }
        
    }
       
}
    
