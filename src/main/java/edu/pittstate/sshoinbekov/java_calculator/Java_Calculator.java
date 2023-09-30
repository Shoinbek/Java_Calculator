/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.pittstate.sshoinbekov.java_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Calculator {

    public static void main(String[] args) {
        double num1;
        double num2;
        double sum;
        System.out.println("Welcome to the Calculator");
        Scanner obj = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your first number>> ");
            try {
                num1 = obj.nextDouble();
                break; // break the loop if a valid number is entered
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: Please enter a number.");
                obj.next();
            }
        }

        while (true) {
            System.out.print("Enter your second number>> ");
            try {
                num2 = obj.nextDouble();
                break; // break the loop if a valid number is entered
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: Please enter a number.");
                obj.next();
            }
        }

        String operation;
        boolean validOperation = false;

        while (!validOperation) {
            System.out.println("Choose a mathematical operation: "
                    + "\n\tFor addition input \"Addition\" or \"+\""
                    + "\n\tFor subtraction input \"Subtract\" or \"-\""
                    + "\n\tFor multiplication input \"Multiply\" or \"*\""
                    + "\n\tFor division input \"Divide\" or \"/\"");

            System.out.print("Your mathematical Operation>> ");
            operation = obj.next().toLowerCase();

            switch (operation) {
                case "addition":
                case "+":
                case "subtract":
                case "-":
                case "multiply":
                case "*":
                case "divide":
                case "/":
                    validOperation = true;
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
            switch (operation) {
                case "addition":
                case "+":
                    sum = num1 + num2;
                    System.out.printf("The sum of %.2f and %.2f is: %.2f", num1, num2, sum);
                    break;
                case "subtract":
                case "-":
                    sum = num1 - num2;
                    System.out.printf("The subtraction of %.2f and %.2f is: %.2f", num1, num2, sum);
                    break;
                case "multiply":
                case "*":
                    sum = num1 * num2;
                    System.out.printf("The multiplication of %.2f and %.2f is: %.2f", num1, num2, sum);
                    break;
                case "divide":
                case "/":
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        sum = num1 / num2;
                        System.out.printf("The division of %.2f and %.2f is: %.2f", num1, num2, sum);
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        }
    }
}
