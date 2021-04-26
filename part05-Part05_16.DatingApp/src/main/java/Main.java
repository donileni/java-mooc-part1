
public class Main {

    public static void main(String[] args) {
        // test your program here!
        
        
        SimpleDate date = new SimpleDate(29, 12, 1990);
        
        date.advance();
        
        System.out.println(date);
        
        date.advance();
        System.out.println(date);
        
        date.advance(10);
        
        System.out.println(date);
        
        SimpleDate newDate = date.afterNumberOfDays(1); 
        
        System.out.println(newDate);
                
    }
}
