/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Games {
    
    public static void answerTheQuestion(Card card){
        card.setCredit(-3300);
        if(card.getCredit() < 0){
            System.out.println("Insufficient Credits");
        }
        System.out.println("-3300 Credits\nAnswer the question correctly!");
        boolean check = false;
        int trueAmount = 0;

        Random num1 = new Random();
        Random num2 = new Random();
        int a = num1.nextInt(6);
        int b = num2.nextInt(6);
        int answer; 
        int ticketsWin;
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("First Question");
            System.out.print(a + " x " + b + " = ");
            answer = sc.nextInt();
            
            if (answer == a*b){
                trueAmount++;
            }
            System.out.println("Second Question");
            System.out.print(a + " + " + b + " = ");
            answer = sc.nextInt();
            
            if (answer == a+b){
                trueAmount++;
            }
            System.out.println("Last Question");
            System.out.print(a + " - " + b + " = ");
            answer = sc.nextInt();
            
            if (answer == a-b){
                trueAmount++;
            }
        }
        if (trueAmount == 0){
            System.out.println("Try Again Next Time!");
        }else if(trueAmount < 3){
            ticketsWin = trueAmount * 30;
            System.out.println("Congrats, You have won " + ticketsWin + " tickets");
            card.setTicket(ticketsWin);
        }else {
            ticketsWin = trueAmount * 30 + 10;
            System.out.println("Congrats, You have won " + ticketsWin + " tickets");
            card.setTicket(ticketsWin);
        }
        
        System.out.println("Your");
    }

}
