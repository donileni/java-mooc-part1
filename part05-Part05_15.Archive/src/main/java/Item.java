/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Item {
    
    private String name;
    private String identifier; 
    
    public Item (String name, String identifier){
        this.name = name; 
        this.identifier = identifier; 
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getIdentifier(){
        return this.identifier;
    }
    
    public boolean equals(Object compare){
        if (this == compare){
            return true; 
        }
        
        if (!(compare instanceof Item)){
            return false; 
            
        }
        
        Item compareItem = (Item) compare;
        
        if (this.identifier.equals(compareItem.identifier)){
            return true; 
        }
        return false;
    }
    
   
}
