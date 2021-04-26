/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Book {
    
    private String authorName; 
    private String title;
    private int pages; 
    
    public Book (String authorName, String title, int pages) {
        this.authorName = authorName;
        this.title = title; 
        this.pages = pages; 
        
    }
    
    public String getAuthor(){
        return this.authorName;
    }
    
    public String getName() {
        return this.title; 
    }
    
    public int getPages() {
        return this.pages; 
    }
    
    public String toString() {
        return this.authorName + ", " + this.title + ", " + this.pages + " pages";
    }
            
}
