
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        
        Person Anton = new Person("Anton", 12, 150, 130); 
        HealthStation näl = new HealthStation();
        
        System.out.println(näl.weigh(Anton)); 
        näl.feed(Anton);
        System.out.println(näl.weigh(Anton));
        
        System.out.println(näl.weighings());
        
        System.out.println(Anton + ", I am fat"); 
    }
}
