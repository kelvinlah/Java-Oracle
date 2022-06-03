/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testclass;

/**
 *
 * @author Kelvin
 */
public class TestClass {

    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();  
        
        //load credits onto each card
        Terminal.convertMoneyToCredits(card1, 5);
        System.out.println("");
        
        Terminal.convertMoneyToCredits(card2, 10);
        System.out.println("");
        
        //play a bunch of game using both cards
        Games.answerTheQuestion(card2);
        System.out.println("");
        
        // transfer the balance of credits and tickets from card1 to card2
        Terminal.transferCredit(card1, card2, 3);
        System.out.println("");
        
        //request prizes using card2
        Terminal.exchangeTicketsToPrize(card2);
        System.out.println("");
        
        //try to play a game and request a prize using card 1
        Games.answerTheQuestion(card1);
        System.out.println("");
        Terminal.exchangeTicketsToPrize(card1);
    }
}
