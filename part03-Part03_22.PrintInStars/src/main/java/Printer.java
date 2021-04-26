
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int stars = 0; 
        for (int number: array){
            while (stars < number){
                System.out.print("*");
                stars++;
            }
            System.out.println("");
            stars = 0;
        }
    }

}
