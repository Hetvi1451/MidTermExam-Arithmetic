/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/**
 * This class calls the method to perform arithmetic operations based on user input.
 * Uses enum instead of string input for better validation.
 */
public class Arithmetic {
    private ArithmeticBase r; // Instance of ArithmeticBase

    public Arithmetic() {  
        this.r = new ArithmeticBase();  // Initialize ArithmeticBase
    }

    public void performOperation() { 
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double n = in.nextDouble();

        System.out.print("Enter second number: ");
        double m = in.nextDouble();

        System.out.print("Enter operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String input = in.next().toUpperCase();  // Convert input to uppercase

        try {
            Operation op = Operation.valueOf(input);  // Convert user input to Enum
            double result = r.calculate(m, n, op);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation. Please enter a valid operation.");
        }

        in.close();
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.performOperation();
    }
}
