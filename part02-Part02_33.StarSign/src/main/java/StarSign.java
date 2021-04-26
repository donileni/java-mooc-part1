
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int counter = 0; number > counter; counter++) { 
            System.out.print("*");
        }   
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int sq = 0; sq < size; sq++){
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int rec = 0; rec < height; rec++){
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int triangle = 1; triangle <= size; triangle++){
            printStars(size - (size - triangle));
        }
    }
}
