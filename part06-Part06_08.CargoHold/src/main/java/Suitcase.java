
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();

    }

    public void addItem(Item item) {

        int itemMaximumWeight = this.maximumWeight - this.totalWeight(); 
        
        if (item.getWeight() <= itemMaximumWeight){
            items.add(item);
        }

    }
    
    public String toString(){
        
        if (items.isEmpty()){
            return "no items (" + this.totalWeight() + " kg)";
        }
        
        if (items.size() == 1){
            return items.size() + " item " + " (" + this.totalWeight() + " kg)";
        }
        
        return "" + items.size() + " items " + " (" + this.totalWeight() + " kg)"; 
    }
    
    public int totalWeight(){
        int totalWeight = 0; 
        for(Item item : items){
            totalWeight += item.getWeight();
        }
        
        return totalWeight; 
    }
    
    public void printItems(){
        
        String suitcaseItems = ""; 
        for (Item item: items){
            suitcaseItems += item.getName() + " (" + item.getWeight() + " kg)" + "\n";
        }
        
        System.out.println(suitcaseItems);
    }
    
    public Item heaviestItem(){
        
        if (items.isEmpty()){
            return null; 
        }
 
        Item heaviestItem = this.items.get(0);
        
        for (Item item: items){
            if (item.getWeight() > heaviestItem.getWeight()){
                heaviestItem = item; 
            }
        }
        return heaviestItem;  
    }
    
      
}
