/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testclass;

import java.util.Scanner;

/**
 *
 * @author Kelvin
 */
public class Terminal {
    
    static void convertMoneyToCredits(Card card, int money){
        int credit = money * 2;
        card.setCredit(credit);
        System.out.println("Card Number = " + card.getCardNum());
        System.out.println("You get " + credit + " credits");
        System.out.println("Credit = " + card.getCredit());
    }
    
    static void checkBalances(Card card){
        System.out.println("Card Number = " + card.getCardNum());       
        System.out.println("Credit = " + card.getCredit());
        System.out.println("Ticket = " + card.getTicket());
    }
    
    static void transferCredit(Card source, Card destination, int amount){
        source.setCredit(-1 * amount);
        destination.setCredit(amount);
        checkBalances(source);
        checkBalances(destination);
    }
    
    static void exchangeTicketsToPrize(Card card){
        boolean exchanged = false;
        System.out.print("1. ");Prizes.electronic();
        System.out.print("2. ");Prizes.stationery();
        System.out.print("3. ");Prizes.food();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose Your Prize!(1/2/3) = ");
        int chosenNum;
        chosenNum = sc.nextInt();
        switch (chosenNum) {
            case 1 -> {
                if(card.getTicket() < 200){
                    System.out.println("Insufficient Tickets!");
                }else {
                    exchanged = true;
                    card.setTicket(-200);
                    System.out.println("Congrats, You have been awarded a TV");
                    Prizes.setTv(1);
                    System.out.println("TV = " + Prizes.getTv() + " left");
                }
            }
            case 2 -> {
                if(card.getTicket() < 10){
                    System.out.println("Insufficient Tickets!");
                }else {
                    exchanged = true;
                    card.setTicket(-10);
                    System.out.println("Congrats, You have been awarded a pencil");
                    Prizes.setPencil(1);
                    System.out.println("Pencil = " + Prizes.getPencil() + " left");
                }
            }
            case 3 -> {
                if(card.getTicket() < 1){
                    System.out.println("Insufficient Tickets!");
                }else {
                    exchanged = true;
                    card.setTicket(-1);
                    System.out.println("Congrats, You have been awarded a candy");
                    Prizes.setCandy(1);
                    System.out.println("Candy = " + Prizes.getCandy() + " left");
                }
            }
            default -> System.out.println("You can't choose that!");
        }
        if (exchanged){
            System.out.println("");
            checkBalances(card);
        }
    }
}
