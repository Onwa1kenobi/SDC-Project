/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.calculator;
import java.util.Scanner;

/**
 *
 * @author Julius
 */
public class Division {
    
    public String division() {
        // Scanner object for obtaining user input from the keyboard
        Scanner input = new Scanner(System.in);
        // Variables to store user input
        double num1, num2, answer;
        String enter, result;
        
        System.out.print("This Program divides a number by another. Press Return/Enter to continue...");
        enter = input.nextLine();
        
        System.out.print("Enter the divider: ");
        num1 = input.nextDouble();
        
        System.out.print("Enter the divisor: ");
        num2 = input.nextDouble();
        
        answer = num1 / num2 ;
        
        result = "The quotient of " + num1 + " divided by " + num2 + " is " + answer;
        System.out.println(result);
        
        return result;
    }
}
