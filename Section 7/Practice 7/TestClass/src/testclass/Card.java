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
    private long cardNum;
    
    public Card(){
        setCardNum();
    }
    
    private void setCardNum(){     
        long min = 601_211_000;
        long max = 601_212_000;
        cardNum = (long) (Math.random() * (max - min) + min);    
    }
    
    public long getCardNum(){   
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
}
