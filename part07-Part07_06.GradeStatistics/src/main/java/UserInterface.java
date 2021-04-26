
import java.util.Scanner;


public class UserInterface {
    
    private Scanner scanner;
    private GradeRegister register; 
    
    
    public UserInterface(Scanner scanner, GradeRegister register){
        this.scanner = scanner;
        this.register = register; 
    }
    
    public void start(){
        this.readPoints();
        this.printAverageAll();
        this.printAveragePassingGrade();
        this.printPassPercentage();
        this.gradeDistribution();
        
        
    }
    
    public void readPoints(){
        System.out.println("Enter points totals, -1 stops");
        
        while (true){
            int input = Integer.valueOf(scanner.nextLine()); 
            if (input == -1){
                break;
            }
            
            if (input < 0 || input > 100){
                continue; 
            }
            
            this.register.addPoints(input);
        }
    }
    
    public void printAverageAll(){
        System.out.println("Point average (all): " + this.register.averagePointsAll());
    }
    
    public void printAveragePassingGrade(){
        if (register.averagePointsPassingGrade() == 0){
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + this.register.averagePointsPassingGrade());
        }
    }
    
    public void printPassPercentage(){
        System.out.println("Pass percentage: " + this.register.passPercentage());
    }
    
    
    
    public void gradeDistribution(){
        System.out.println("Grade distribution: ");
        
        int grade = 5; 
        
        while (grade >= 0){
            int stars = register.totalGradesFromPoints(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");
            
            grade--; 
        }
        
    }
    
    public static void printStars(int stars){
        while (stars > 0){
            System.out.print("*");
            stars--;
        }
    }
}
