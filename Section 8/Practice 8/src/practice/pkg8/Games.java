/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.pkg8;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Kelvin
 */
public class Games {
    private static Random num = new Random();
    private static Teams team1 = new Teams();
    private static Teams team2 = new Teams();
    private static Teams team3 = new Teams();
    private static Teams team4 = new Teams();
  
    private static ArrayList<Integer> temperature = new ArrayList<>();
    
    static void startGame(int gamesPlayed, int temperature){
        for(int i = 0; i<gamesPlayed; i++){
            Games.temperature.add(temperature);
            int homeTeam = num.nextInt(4) + 1;
            int awayTeam;
            do {
                awayTeam = num.nextInt(4) + 1;
            }while(homeTeam == awayTeam);
            
            
        }
    }
    
    static void result(){
        System.out.println("********RESULTS********");
        Teams.displayStatistic(team1);
        Teams.displayStatistic(team2);
        Teams.displayStatistic(team3);
        Teams.displayStatistic(team4);
        
        for (int i = 1; i<=game.size; i++) {
            System.out.println("Game #" + i);
            System.out.println("Temperature: ");
            System.out.println("Away Team: ");
            System.out.println("Home Team: ");
        }
        
        System.out.println("Hottest Temp: ");
        System.out.println("Average Temp: ");
    }
    
    
}
