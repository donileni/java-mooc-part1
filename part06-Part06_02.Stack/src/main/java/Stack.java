
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Stack {
    
    private ArrayList<String> stack; 
    
    public Stack(){
        this.stack = new ArrayList<>(); 
    }
    
    public boolean isEmpty(){
        if (this.stack.isEmpty()){
            return true;
        }
        return false; 
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        return stack;   
    }
    
    public String take(){
        int i = this.stack.size() - 1;
        String value = this.stack.get(i);
        this.stack.remove(i);
        return value;
}
}
