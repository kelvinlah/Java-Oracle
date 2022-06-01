/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color code");
        double wavelength = input.nextDouble();
        input.close();
        
        if (wavelength < 380 || wavelength >= 750){     
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }else {
            System.out.print("The Color is ");
            if (wavelength >= 380 && wavelength < 450){
                System.out.println("Violet");
            }else if (wavelength >= 450 && wavelength < 495){
                System.out.println("Blue");
            }else if (wavelength >= 495 && wavelength < 570){
                System.out.println("Green");
            }else if (wavelength >= 570 && wavelength < 590){
                System.out.println("Yellow");
            }else if (wavelength >= 590 && wavelength < 620){
                System.out.println("Orange");
            }else if (wavelength >= 620 && wavelength < 750){
                System.out.println("Red");
            }
        }
    }
}