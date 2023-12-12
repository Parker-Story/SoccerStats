// Represents a soccer team and its statistics.

public class Team 
{
    private String name;
    private int wins;
    private int draws;
    private int losses;
    private int goalsFor;
    private int goalsAgainst;
   
      /**
      *    
      * Constructs a Team with the given name.
      *
      * @param name The name of the team.
      */
      public Team(String name) 
      {
         this.name = name;
      }
   
      /**
       * Gets the name of the team.
       *
       * @return The team name.
       */
      public String getName() 
      {
         return name;
      }
   
      /**
       * Increments the number of wins for the team.
       */
      public void addWin() 
      {
         wins++;
      }
   
      /**
       * Increments the number of draws for the team.
       */
      public void addDraw() 
      {
         draws++;
      }
   
      /**
       * Increments the number of losses for the team.
       */
      public void addLoss() 
      {
         losses++;
      }
   
      /**
       * Adds goals scored to the team's statistics.
       *
       * @param goals The number of goals scored.
       */
      public void addGoalsFor(int goals) 
      {
         goalsFor += goals;
      }
   
      /**
       * Adds goals conceded to the team's statistics.
       *
       * @param goals The number of goals conceded.
       */
      public void addGoalsAgainst(int goals) 
      {
         goalsAgainst += goals;
      }
   
      /**
       * Gets the number of goals scored by the team.
       *
       * @return The goals scored.
       */
      public int getGoalsFor() 
      {
         return goalsFor;
      }
   
      /**
       * Gets the number of goals conceded by the team.
       *
       * @return The goals conceded.
       */
      public int getGoalsAgainst() 
      {
         return goalsAgainst;
      }
   
      /**
       * Calculates the goal difference for the team.
       *
       * @return The goal difference (goals scored minus goals conceded).
       */
      public int getGoalDifference() 
      {
         return goalsFor - goalsAgainst;
      }
   
      /**
       * Calculates the total points earned by the team (3 points per win, 1 point per draw).
       *
       * @return The total points.
       */
      public int getPoints() 
      {
         return (wins * 3) + (draws);
      }
   
      public String getTeamStats() 
      {
         return String.format("%s W: %d D: %d L: %d GF: %d GA: %d PTS: %d",
                name, wins, draws, losses, goalsFor, goalsAgainst, getPoints());
      }
   }
