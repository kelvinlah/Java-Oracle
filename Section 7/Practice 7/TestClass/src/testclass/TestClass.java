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
        
        card1.displayInfo();
        card1.displayInfo();
        card2.displayInfo();
        // load credits onto each card
        card1.setCredit(5000);
        card2.setCredit(5000);
        
        //play a bunch of game using both cards
        //Games.answerTheQuestion(card1);
        // transfer the balance of credits and tickets from card1 to card2
        
        //request prizes using card2

        //try to play a game and request a prize using card 1
    }
    
}
