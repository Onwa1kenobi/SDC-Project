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
public class Addition {
    public String addition()
    {
        Scanner input = new Scanner(System.in);
        double fnum, snum, answer ;
        String enter, result;
        System.out.println("This Program adds two Numbers together. Press Return/Enter to continue...");
        enter = input.nextLine();
        
        System.out.print("Enter the first number: ");
        fnum = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        snum = input.nextDouble();
        
        answer = fnum + snum ;
        
        result = "The sum of " + fnum + " and " + snum + " is " + answer;
        System.out.println(result);
        
        return result;
    }
}
