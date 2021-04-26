
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            
            if (sentence.equals("")) {
                break;
            }

            for (String avWords : words) {
                if (avWords.contains("av")) {
                    System.out.println(avWords);
                }

            } 
            

        }
    }

}
