
import java.util.ArrayList;


public class GradeRegister {
    
    private ArrayList<Integer> points;
    private ArrayList<Integer> pointsPassingGrade;
    private ArrayList<Integer> grades;
    
    
    public GradeRegister(){
        this.points = new ArrayList<>();
        this.pointsPassingGrade = new ArrayList<>();
        this.grades = new ArrayList<>(); 
    }
    
    public void addPoints(int points){
        
        if (points >= 0 && points <= 100){
            this.points.add(points);
        }
        
        if (points >= 50 && points <= 100){
            this.pointsPassingGrade.add(points);
        }
        
        this.grades.add(pointsToGrade(points));
        
    }
    
    public double averagePointsAll(){
        int lenght = this.points.size(); 
        int total = 0; 
        
        if (this.points.isEmpty()){
            return -1; 
        } else {
            for (int point : this.points){
            total += point; 
        }
            
        }
        
        return ((1.0 * total) / lenght); 
    }
    
    public double averagePointsPassingGrade(){
        int lenght = this.pointsPassingGrade.size();
        int total = 0; 
        
        if(this.pointsPassingGrade.isEmpty()){
            return 0.00;  
        } else {
            for (int point : this.pointsPassingGrade){
                total += point; 
            }
        }
        
        return ((1.0 * total) / lenght); 
    }
    
    public double passPercentage(){
        
        int participants = this.points.size();
        int passing = this.pointsPassingGrade.size();
        double passingRatio = (double) passing / participants; 
        
        if (participants == 0){
            return -1; 
        } else {
            return 100 * passingRatio; 
        }
    }
    
    public static int pointsToGrade(int points){
        
        int grade = 0; 
        
        if (points < 50){
            grade = 0;   
        } else if (points < 60){
            grade = 1; 
        } else if (points < 70){
            grade = 2;
        } else if (points < 80){
            grade = 3;
        } else if (points < 90){
            grade = 4;
        } else {
            grade = 5;
        }
        return grade; 
    }
    
    public int totalGradesFromPoints(int grade){
        int total = 0; 
        for (int recieved : this.grades){
            if (recieved == grade){
                total ++; 
            }
        }
        return total;
    }
}
