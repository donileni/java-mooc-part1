
import java.util.ArrayList;


public class Hold {
    private int totalMaximumWeight;
    private ArrayList<Suitcase> suitcases; 
    
    
    public Hold(int maximumWeight){
        this.totalMaximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>(); 
    }
    
    public void addSuitcase(Suitcase newSuitcase){
        int maximumWeight = this.totalMaximumWeight - this.totalWeight();
        
        if (newSuitcase.totalWeight() <= maximumWeight){
            this.suitcases.add(newSuitcase);
        }
    }
    
    public String toString(){
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public int totalWeight(){
        int totalWeight = 0; 
        for(Suitcase suitcase : suitcases){
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight; 
    }
    
    public void printItems(){
        
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
        
    }
}
