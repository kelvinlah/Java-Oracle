/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;


public class ComputeMethods {
    public double fToC(double degreesF){
        double degreesC;
        degreesC = 5 * (degreesF - 32) / 9;
        return degreesC;
    }
    
    public double hypotenuse(int a, int b){
        double total;
        total = Math.sqrt((a*a) + (b*b));
        return total;
    }
    
    public int roll(){
        Random num = new Random();
        int diceOne = num.nextInt(6) + 1;
        int diceTwo = num.nextInt(6) + 1;
        return diceOne + diceTwo;
    }
}

