/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processingname;

import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        String firstname;
        String lastname;
    try (Scanner console = new Scanner(System.in)) {
        System.out.print("Enter your name: ");     
        // your code goes here
        firstname = console.next();
        lastname = console.next();
    }
        System.out.println(firstname.length());
        System.out.println(lastname + ", " + firstname.charAt(0) + ".");
    }
}