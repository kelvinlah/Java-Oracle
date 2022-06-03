/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.pkg8;



/**
 *
 * @author Kelvin
 */
public class Teams {
    private static int winTotal, lossTotal, tieTotal, goalScored, goalAllowed;
    private static final String team[] = {"Team 1", "Team 2", "Team 3", "Team 4"};
    
    static void displayStatistic(Teams team){
        System.out.print("Wins: " + Teams.getTeamWin());
        System.out.print(", Losses: " + Teams.getTeamLosses());
        System.out.println(", Ties: " + Teams.getTeamTies());
        System.out.print("Point Scored: " + Teams.getGoalTotal());
        System.out.print("Point Allowed: " + Teams.getGoalAllowed());
    }
    
    static String getTeam(int teamPicked){
        return team[teamPicked];
    }
        
    static void setTeamWin(int winTotal){
        Teams.winTotal = winTotal;
    }
    
    static int getTeamWin(){
        return winTotal;
    }
    
    static void setTeamLosses(int lossTotal){
        Teams.lossTotal = lossTotal;
    }
    
    static int getTeamLosses(){
        return lossTotal;
    }
    
    static void setTeamTies(int tieTotal){
        Teams.tieTotal = tieTotal;
    }
    
    static int getTeamTies(){
        return tieTotal;
    }
    
    static void setGoalTotal(int goalScored){
        Teams.goalScored = goalScored;
    }
    
    static int getGoalTotal(){            
        return goalScored;
    }
    
    static void setGoalAllowed(int goalAllowed){
        Teams.goalAllowed = goalAllowed;
    }
    
    static int getGoalAllowed(){
        return goalAllowed;
    }
}//end class Team

