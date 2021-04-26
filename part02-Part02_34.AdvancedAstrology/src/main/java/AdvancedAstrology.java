
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int counter = 0; number > counter; counter++) { 
            System.out.print("*");
        }   
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int spaces = 0; spaces < number; spaces++){ 
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int triangle = 1; triangle <= size; triangle++){
            printSpaces(size - triangle);
            printStars(size - (size - triangle));
        }
    }

    public static void christmasTree(int height) {
        for (int tree = 1; tree <= height; tree++){
            printSpaces(height - tree);
            printStars(tree + (tree - 1));
        }
           
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
        
        int y = 2000;
        if (y >= 1000 && y % 25 == 0) {
    System.out.println("Gets a gift card!");
} else if (y % 2000 == 0) {
    System.out.println("Gets a large gift card!");
} else {
    System.out.println("Gets nothing.");
    
    }
    }   
    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
