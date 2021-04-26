
import java.util.ArrayList;
import java.util.Random;


public class JokeManager {
    private ArrayList<String> jokes; 
    
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.jokes.add(joke); 
    }
    
    public String drawJoke(){
        
        if (this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            String randomJoke = "";
            int index = draw.nextInt(jokes.size());
            
            randomJoke = this.jokes.get(index);
            return randomJoke;
        }
    }
    
    public void printJokes(){
        for (String joke : jokes){
            System.out.println(joke);
        }
    }
}
