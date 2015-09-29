/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.calculator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author Julius
 */
public class SimpleCalculator {
    

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int choice = 0, op = 0, c;
        String state;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program is a simple calculator.");
        System.out.println("Please Enter the following codes for the corresponding operation");
        
        chooseOperation:
        //for(op = op; ; op++) {m
            System.out.println("1. Calculative Operation");
            System.out.println("2. Logical Operation");
            System.out.println("3. Read previous Operation");
            System.out.println("0. QUIT ");
            System.out.print("Enter option: ");
            
            op = input.nextInt();
            
            switch(op) {
                case 1: 
                    state = "Calculation";
                    calculation();
                    break;
                    
                case 2: 
                    state = "Logic";
                    logic();
                    break;
                    
                case 3:
                    readFile();
                    break;
                    
                case 0: 
                    System.out.print("Bye...");
                    System.exit(0);
                    break;
            }
    }
        //}
            
        public static void calculation() {
            int choice = 0;
            Scanner input = new Scanner(System.in);
            String result;
            out:
            for(choice = choice; ; choice++){
                System.out.println("1. Simple Addition");
                System.out.println("2. Simple Subtraction");
                System.out.println("3. Division");
                System.out.println("4. Multiplication");
                System.out.println("0. QUIT ");
                System.out.print("Enter option: ");
                
                try {
                    choice = input.nextInt();
                }catch(Exception e) {
                    System.out.println("Invalid entry, please try again");
                        //continue;
                }
        
                switch(choice)
                {
                    case 1: Addition additionObject = new Addition();
                            result = additionObject.addition();
                            
                            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("file.txt"), "utf-8"))) {
                            writer.write(result);
                            } catch (IOException e) {
                            }
                            break;
                
                    case 2: Subtraction subtractionObject = new Subtraction();
                            result = subtractionObject.subtraction();
                            
                            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("file.txt"), "utf-8"))) {
                            writer.write(result);
                            } catch (IOException e) {
                            }
                            break;
                
                    case 3: Division divisionObject = new Division();
                            result = divisionObject.division();
                            
                            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("file.txt"), "utf-8"))) {
                            writer.write(result);
                            } catch (IOException e) {
                            }
                            break;
                
                    case 4: Multiplication multiplicationObject = new Multiplication();
                            result = multiplicationObject.multiplication();
                            
                            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("file.txt"), "utf-8"))) {
                            writer.write(result);
                            } catch (IOException e) {
                            }
                            break;
            
                    case 0: System.out.print("Bye...");
                            System.exit(0);
                            break;
                
                    default:  System.out.println("Invalid entry, try again. ");
                              continue;
                }
                
                System.out.print("Enter 1 to choose another option, 2 to choose another operation or anything else to quit: ");
                
                try {
                    int entry = input.nextInt();
                    if(entry == 1)
                        main(null);
                
                    else if (entry == 2)
                        continue;
                
                    else {
                        System.out.print("Bye...");
                        System.exit(0);
                    }
                    }catch(Exception e) {
                        System.out.println("Invalid entry, please try again");
                        continue;
                    }
        }
        
    }
        
        public static void logic() {
            int choice = 0;
            Scanner input = new Scanner(System.in);
            String result;
            out:
            for(choice = choice; ; choice++){
                System.out.println("1. AND operation");
                System.out.println("2. OR operation");
                System.out.println("0. QUIT ");
                System.out.print("Enter option: ");
                choice = input.nextInt();
        
                switch(choice)
                {                    
                    case 1: AndOperation andObject = new AndOperation();
                            result = andObject.andOperation();
                            
                            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("file.txt"), "utf-8"))) {
                            writer.write(result);
                            } catch (IOException e) {
                            }
                            
                            break;
                
                    case 2: OrOperation orObject = new OrOperation();
                            result = orObject.orOperation();
                            
                            try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("file.txt"), "utf-8"))) {
                            writer.write(result);
                            } catch (IOException e) {
                            }
                            break;
                        
                    case 0: System.out.print("Bye...");
                            System.exit(0);
                            break;
                
                    default:  System.out.println("Invalid entry, try again. ");
                              continue out;
                }
                
                System.out.print("Enter 1 to choose another option, 2 to choose another operation or anything else to quit: ");
                try {
                    int entry = input.nextInt();
                    if(entry == 1)
                        main(null);
                
                    else if (entry == 2)
                        continue;
                
                    else {
                        System.out.print("Bye...");
                        System.exit(0);
                    }
                    }catch(Exception e) {
                        System.out.println("Invalid entry, please try again");
                        continue;
                    }
            }
        }
        
        public static void readFile() {
        // The name of the file to open.
        String fileName = "file.txt";

        Scanner input = new Scanner(System.in);
        
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
        }
        
        System.out.print("Enter 1 to choose another option or anything else to quit: ");
                try {
                    int entry = input.nextInt();
                    if(entry == 1)
                        main(null);
                
                    else {
                        System.out.print("Bye...");
                        System.exit(0);
                    }
                    }catch(Exception e) {
                        System.out.println("Invalid entry, please try again");
                        System.out.print("Bye...");
                        System.exit(0);
                    }
        
        }
}