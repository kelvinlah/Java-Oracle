/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
public class TestClass {

    public static void main(String args[]) {
        ComputeMethods computeMethods;
        computeMethods = new ComputeMethods();
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
        
        System.out.println(computeMethods.fToC(100));
        System.out.println(computeMethods.hypotenuse(3, 4));
        System.out.println(computeMethods.roll());
    }
}
