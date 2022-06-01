/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;


public class TrafficLightChecker {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color code");
        int colorCode = input.nextInt();
        input.close();
        
        if (colorCode < 1 || colorCode >= 4){
            System.out.println("Invalid color");
        }else {
            System.out.print("Next Traffic Light is ");
            if(colorCode == 1){
                System.out.println("green");
            }else if (colorCode == 2){
                System.out.println("yellow");
            }else if (colorCode == 3){
                System.out.println("red");
            }
        }
    }   
}
