
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Recipe {
    private String name; 
    private int cookingTime; 
    private ArrayList<String> ingredients; 
    
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients){
        this.name = name; 
        this.cookingTime = cookingTime; 
        this.ingredients = ingredients;      
    }
    
    public String getName(){
        return this.name; 
    }
    
    public int getCookingTime(){
        return this.cookingTime; 
    }
    
    public List<String> getIngredients(){
        return this.ingredients;
    }
    
    
}
