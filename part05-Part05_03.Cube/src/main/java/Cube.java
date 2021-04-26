/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Cube {
    
    private int edgeLength;
    
    public Cube (int lenght) {
        this.edgeLength = lenght; 
        
    }
    
    public int volume () {
        return this.edgeLength * this.edgeLength * this.edgeLength; 
    }
    
    public int getLenght() {
        return this.edgeLength;
    }
    
    public String toString () {
        return "The length of the edge is " + this.getLenght() + " and the volume " + this.volume();
    }
}
