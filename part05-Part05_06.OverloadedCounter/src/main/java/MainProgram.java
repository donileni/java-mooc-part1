
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        
        Counter counter = new Counter(1); 
        
        counter.decrease();
        counter.increase();
        counter.increase();
        counter.decrease();
        counter.increase(10);
        counter.decrease(4);
        
        System.out.println(counter.value());
    }
}
