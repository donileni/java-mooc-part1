
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        
        Item book = new Item("The lord of the rings", 2); 
        Item phone = new Item("Nokia 3210", 1); 
        Item brick = new Item("brick", 4); 
        
        Suitcase suitcase = new Suitcase(10); 
        
        suitcase.addItem(book);
        suitcase.addItem(phone);
        
        Suitcase suitcaseTwo = new Suitcase(10); 
        suitcaseTwo.addItem(brick);
        
        Hold hold = new Hold (10); 
        
        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcaseTwo);
        
        System.out.println(hold);
        
        hold.printItems();
        
        
    }

}
