// A program that keeps track of team statistics for a soccer league.

/* 
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * The SoccerStats class is responsible for keeping track of team statistics for a soccer league based on game scores.
 */
class SoccerStats 
{
    private Map<String, Team> teams;

   /**
    * Constructs a SoccerStats object and reads game information from a CSV file.
    *
    * @param csvFile The name of the CSV file containing game scores in the format: Home Team, Away Team, Home Goals, Away Goals.
    */
   public SoccerStats(String csvFile) 
   {
      teams = new HashMap<>();
      try (Scanner scanner = new Scanner(new File(csvFile))) 
      {
         while (scanner.hasNextLine()) 
         {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String homeTeam = parts[0];
            String awayTeam = parts[1];
            int homeGoals = Integer.parseInt(parts[2]);
            int awayGoals = Integer.parseInt(parts[3]);
            
            processGameResult(homeTeam, awayTeam, homeGoals, awayGoals);
         }
      } 
      catch (FileNotFoundException e) 
      {
         System.out.println("File Not Found Exception");
      }
   }

   /**
    * Processes the result of a soccer game and updates team statistics.
    *
    * @param homeTeam   The name of the home team.
    * @param awayTeam   The name of the away team.
    * @param homeGoals  The number of goals scored by the home team.
    * @param awayGoals  The number of goals scored by the away team.
    */
    public void processGameResult(String homeTeam, String awayTeam, int homeGoals, int awayGoals) 
    {
       Team home = teams.get(homeTeam);
       Team away = teams.get(awayTeam);
    
       if (home == null) 
       {
          home = new Team(homeTeam);
          teams.put(homeTeam, home);
       }
    
       if (away == null) 
       {
          away = new Team(awayTeam);
          teams.put(awayTeam, away);
       }
    
       home.addGoalsFor(homeGoals);
       home.addGoalsAgainst(awayGoals);
       away.addGoalsFor(awayGoals);
       away.addGoalsAgainst(homeGoals);
    
       if (homeGoals > awayGoals) 
       {
          home.addWin();
          away.addLoss();
       } 
       else if (homeGoals < awayGoals) 
       {
          home.addLoss();
          away.addWin();
       } 
       else 
       {
          home.addDraw();
          away.addDraw();
       }
    }

    /**
    * Processes requests for league statistics and generates the corresponding output.
    *
    * @param statsFile The name of the file containing requests for league statistics.
    * @return A string containing the responses to the requests.
    */
   public String getStats(String statsFile) 
   {
      StringBuilder result = new StringBuilder();
      
      try (Scanner scanner = new Scanner(new File(statsFile))) 
      {
         while (scanner.hasNextLine()) 
         {
            String line = scanner.nextLine();
            String[] request = line.split(" ");
            String command = request[0];
         }
      
      }
      catch(FileNotFoundException e)
      {
         System.out.println("File Not Found Exception");
      }
      return result.toString();  
   }
}