
import java.util.ArrayList;


public class Bird {
    private String name; 
    private String latinName; 
    private int observations; 
    
    public Bird (String name, String latinName){
        this.name = name; 
        this.latinName = latinName; 
        this.observations = 0; 
    }
    
    public String getname(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public void addObservation(){
        this.observations += 1; 
    }
    
    public int getObservations(){
        return this.observations; 
    }
    
    public String toString(){
        String printBird = this.name + " (" + this.latinName + "): " + this.observations + " observations"; 
        return printBird;
    } 
    
}
