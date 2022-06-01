/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        input.close();
        
        for (int i = 1; i<13; i++){
            System.out.println(num*i);
        }
    }

}
