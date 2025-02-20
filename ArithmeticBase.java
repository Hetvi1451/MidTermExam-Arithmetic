/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

// Define an Enum for allowed operations
enum Operation {
    PLUS, MINUS, TIMES, DIVIDE
}


/**
 * This class takes Enum input (PLUS, MINUS, TIMES, DIVIDE)
 * from the user and executes the arithmetic operation.
 */
public class ArithmeticBase {
    public double calculate(double x, double y, Operation op) {
        switch (op) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                if (y == 0) {
                    System.out.println("Error: Division by zero!");
                    return 0;  // Return 0 instead of crashing
                }
                return x / y;
            default:
                throw new IllegalArgumentException("Invalid Operation");
        }
    }
}
