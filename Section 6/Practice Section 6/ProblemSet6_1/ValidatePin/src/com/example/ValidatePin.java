/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        int validPin = 123456;
        Scanner enterPin = new Scanner(System.in);  
        int pinInputed;
        boolean repeat = false;
        do {
            if (repeat){
                System.out.println("You entered the wrong PIN!");
            }
            System.out.print("Enter your pin : ");
            pinInputed = enterPin.nextInt();
            
            repeat = true;
        } while (validPin != pinInputed);
        
        System.out.println("You entered the corecct PIN!\nYou now have access to your Account!");
        enterPin.close();
    }
}
