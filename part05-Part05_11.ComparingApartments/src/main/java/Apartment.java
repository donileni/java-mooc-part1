
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
        this.price = pricePerSquare * squares; 
    }
    
    public boolean largerThan(Apartment compare){
        if (this.squares > compare.squares){
            return true; 
        }
        return false;
    }
    
    public int priceDifference(Apartment compare){
        int price = this.price - compare.price;
        return Math.abs(price);
    }
    
    public boolean moreExpensiveThan(Apartment compare){
        if (this.price > compare.price){
            return true; 
        }
        return false;
    }

}
