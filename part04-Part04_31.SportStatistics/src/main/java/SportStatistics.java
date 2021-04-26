
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine(); 
        System.out.println("Team: ");
        String team = scan.nextLine(); 
        int number = 0;
        int wins = 0; 
        int losses = 0;
        int draws = 0;
        
        try (Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()){
                if (reader.nextLine().contains(team)){
                    number++;
                }
            }
        } catch (Exception e) {         
            
        }
        
        
        
        try (Scanner readerTwo = new Scanner(Paths.get(file))){
            while(readerTwo.hasNextLine()){
                String lines = readerTwo.nextLine();
                String [] parts = lines.split(",");
                String homeTeam = parts [0];
                String awayTeam = parts [1]; 
                int homePoints = Integer.valueOf(parts [2]); 
                int awayPoints = Integer.valueOf(parts [3]); 
                
                if (team.equals(homeTeam) && homePoints > awayPoints){
                    wins++;
                } 
                
                if (team.equals(awayTeam) && awayPoints > homePoints){
                    wins++; 
                } 
                
                if (team.equals(homeTeam) && homePoints < awayPoints){
                    losses++;
                } 
                
                if (team.equals(awayTeam) && awayPoints < homePoints){
                    losses++; 
            }
        } 
            
        } catch (Exception e) {
            
        }
        
        
        System.out.println("Games: " + number);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        

    }

}
