/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.pkg8;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Scheduler {
    private static int temperature;
    
    static void setTemperature(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        temperature = sc.nextInt();
    }
    
    static int getTemperature(){
        return temperature;
    }
    
    static void startLeague(){
        int tempLimit = 0;
        
        while (tempLimit != 3){
            Scheduler.setTemperature();
            if(Scheduler.getTemperature() <= 10){
                System.out.println("Too cold to play.");
                tempLimit++;
            }else if(Scheduler.getTemperature() > 10 && Scheduler.getTemperature() <= 35){
                Games.startGame(2);
            }else {
                Games.startGame(1);
            }  
        }
        System.out.println("Season is Over");
    }   
}
