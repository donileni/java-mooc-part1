
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner; 
     

    
    public UserInterface(Scanner scanner){
        this.scanner = scanner; 
         
    }
    
    public void start(){
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("File to read: ");
        String file = scanner.nextLine(); 
        
        ArrayList<Recipe> recipes = readRecipesFromFile(file); 
        
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        
        while (true){
            System.out.print("Enter command: ");
            String input = scanner.nextLine(); 
            
            if (input.equals("stop")){
                break; 
            }
            
            if (input.equals("list")){
                System.out.println("Recipes: ");
                for (Recipe recipe: recipes){
                    System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                }
            }
            
            if (input.equals("find name")){
                System.out.print("Searched word: ");
                String searchedWord = scanner.nextLine();
                System.out.println("Recipes: ");
                for (Recipe recipe: recipes){
                    if (recipe.getName().contains(searchedWord)){
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                    }
                }
            }
            
            if (input.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes: ");

                for (Recipe recipe: recipes){
                    if (recipe.getCookingTime() <= time){
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                    }
                }
            }
            
            if (input.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                for (Recipe recipe: recipes){
                    if (recipe.getIngredients().contains(ingredient)){
                        System.out.println(recipe.getName() + ", cooking time: " + recipe.getCookingTime());
                    }
                }
            }
           
        }
    }
    
    public static ArrayList<Recipe> readRecipesFromFile(String file){
        ArrayList<Recipe> recipes = new ArrayList<>(); 
        ArrayList<String> recipeParts = new ArrayList <>();
        
        try (Scanner scanner = new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (!line.isEmpty()){
                    recipeParts.add(line);
                } else {
                    assignRecipeParts(recipes, recipeParts);
                }
            }
            
            if (!recipeParts.isEmpty()){
                assignRecipeParts(recipes, recipeParts); 
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return recipes; 
    }
    
    public static void assignRecipeParts(ArrayList<Recipe> recipes, ArrayList<String> recipeParts){
        String name; 
        int cookingTime; 
        name = recipeParts.get(0); 
        cookingTime = Integer.valueOf(recipeParts.get(1)); 
        recipeParts.remove(0); 
        recipeParts.remove(0); 
        recipes.add(new Recipe(name, cookingTime, new ArrayList<>(recipeParts))); 
        recipeParts.clear(); 
    }
    
}
