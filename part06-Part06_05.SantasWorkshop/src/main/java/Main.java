
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        
       Gift book = new Gift("johan", 1); 
       Gift hej = new Gift("anton", 3);
       
        System.out.println("Book's name: " + book.getName());
        System.out.println("Book's weight: " + book.getWeight());
        
        System.out.println("Gift: " + book);
        
        Package gifts = new Package();
        
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
        
        gifts.addGift(hej);
        System.out.println(gifts.totalWeight());
                

    }
}
