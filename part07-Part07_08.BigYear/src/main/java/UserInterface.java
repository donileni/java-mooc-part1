
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;

    }

    public void start() {

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        System.out.println("Available commands: ");
        System.out.println("Add - adds a bird to the list");
        System.out.println("Observation -- adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");

        while (true) {
            System.out.print("? ");
            String input = scan.nextLine();

            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();

                System.out.print("Name in latin: ");
                String latinName = scan.nextLine();

                birds.add(new Bird(name, latinName));

            }

            if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String birdToObserv = scan.nextLine();
                boolean isIncluded = false;

                for (Bird bird : birds) {
                    if (bird.getname().equals(birdToObserv) || bird.getLatinName().equals(birdToObserv)) {
                        bird.addObservation();
                        isIncluded = true;
                    }
                }
                
                if (!isIncluded){
                    System.out.println("Not a bird!");
                }

            }

            if (input.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if (input.equals("One")) {
                System.out.print("Bird? ");
                String printBird = scan.nextLine();

                for (Bird bird : birds) {
                    if (bird.getname().equals(printBird) || (bird.getLatinName().equals(printBird))) {
                        System.out.println(bird);
                    }
                }
            }

            if (input.equals("Quit")) {
                break;
            }
        }
    }

}
