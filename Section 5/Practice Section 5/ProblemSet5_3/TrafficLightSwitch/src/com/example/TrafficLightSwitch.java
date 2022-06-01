
package com.example;

import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color code");
        int colorCode = input.nextInt();
        input.close();
        
        switch (colorCode){
                case 1 -> System.out.println("Next Traffic Light is green"); 
                case 2 -> System.out.println("Next Traffic Light is yellow");
                case 3 -> System.out.println("Next Traffic Light is red");
                default -> { 
                        System.out.println("Invalid color");
                        }
        }
    }
}


