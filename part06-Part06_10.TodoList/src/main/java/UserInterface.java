
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList newTodoList, Scanner newScanner) {
        this.scanner = newScanner;
        this.todoList = newTodoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("To add: ");
                String addToList = scanner.nextLine();
                this.todoList.add(addToList);
            } else if (command.equals("list")){
                this.todoList.print();
            } else if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int removeFromList = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(removeFromList);
            }
        }
    }
}
