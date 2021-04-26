
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("First name: ");
            String firstName = scanner.nextLine(); 
            if (firstName.isEmpty()){
                break;
            }
            
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String number = scanner.nextLine();
            
             infoCollection.add(new PersonalInformation(firstName, lastName, number));
        }
        System.out.println("");
       for(PersonalInformation people: infoCollection){
           System.out.println(people.getFirstName() + " " + people.getLastName());
           
       }

    }
}
