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
public class AndOperation {
    public String andOperation()
    {
        Scanner input = new Scanner(System.in);
        double fnum, snum, answer ;
        String enter, result = null;
        System.out.println("This Program gives basic characteristics of two Numbers together. Press Return/Enter to continue...");
        enter = input.nextLine();
        
        System.out.println("Enter the first number");
        fnum = input.nextDouble();
        
        System.out.println("Enter the second number");
        snum = input.nextDouble();
        
        if (fnum <= 10 && snum <=10) {
            result = "Both " + fnum + " and " + snum + " are less than or equal to 10";
            System.out.println(result);
        }
        else if (fnum % 2 == 0 && snum % 2 == 0) {
            result = "Both " + fnum + " and " + snum + " are even numbers";
            System.out.println(result);
        }
        else if (fnum % 2 != 0 && snum % 2 != 0){
            result = "Both " + fnum + " and " + snum + " are odd numbers";
            System.out.println(result);
        }
        
        
        return result;
    }
}
