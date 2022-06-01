/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;

/**
 *
 * @author Kelvin
 */
public class Prizes {
    private static int needTicket;

    private static int tv = 2, pencil = 1, candy = 10;
    
    static void setCandy(int candy){
        Prizes.candy -= candy; 
    }
    
    static int getCandy(){
        return candy;
    }
    
    static void setPencil(int pencil){
        Prizes.pencil -= pencil;
    }
    
    static int getPencil(){
        return pencil;
    }
    
    static void setTv(int tv){
        Prizes.tv -= tv;
    }
    
    static int getTv(){
        return tv;
    }
    
    static void electronic(){
        needTicket = 200;
        System.out.println("TV = " + getTv() + " left");
        System.out.println("You need "+ needTicket + " Tickets");
    }
    
    static public void stationery(){
        needTicket = 10;
        System.out.println("Pencil = " + getPencil() + " left");
        System.out.println("You need " + needTicket + " Tickets");
    }
    
    static public void food(){
        needTicket = 1;
        System.out.println("Candy = " + getCandy() + " left");
        System.out.println("You need " + needTicket + " Tickets");
    }
}
