/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;


/**
 *
 * @author Kelvin
 */
public class Card {
    private int credit, ticket;
    private static long cardNum;
    
    
    public static long getCardNum(){        
        long min = 601_211_000;
        long max = 601_231_234;
        cardNum = (long) (Math.random() * (max - min) + min);       
        return cardNum;
    }
    
    public void setCredit(int credit){
       this.credit += credit;
    }

    public int getCredit(){
        return credit;
    }

    public void setTicket(int ticket){
        this.ticket += ticket;
    }
    
    public int getTicket(){
        return ticket;
    }
    
    public void displayInfo(){
        System.out.println(getCredit());
        System.out.println(getTicket());
        System.out.println(getCardNum());
    }
}
