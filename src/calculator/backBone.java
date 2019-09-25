/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author Joe
 */
public class backBone  {
    
    public static void sum(){
        
    //Var and scanner
    Scanner scan = new Scanner(System.in);
    double num1; 
    double num2;
    double sum;
     //Start of the calculator
    System.out.println("Addition");
    System.out.println("Enter a number. ");
    num1 = scan.nextDouble();
    
    System.out.println("Enter a second number. ");
    num2 = scan.nextDouble();
    
    sum = num1 + num2;
    System.out.println("Sum of: "+num1 +" and " +num2 + " = "+ sum);
    }
    
    public static void subtract(){
        
       //Var and scanner
    Scanner scan = new Scanner(System.in);
    double num1; 
    double num2;
    double sum;
     //Start of the calculator
    System.out.println("Subtraction");
    System.out.println("Enter a number. ");
    num1 = scan.nextDouble();
    
    System.out.println("Enter a second number. ");
    num2 = scan.nextDouble();
    
    sum = num1 - num2;
    System.out.println("Sum of: "+num1 +" and " +num2 + " = "+ sum);  
      }
    
    public static void multiply()
    {
         //Var and scanner
    Scanner scan = new Scanner(System.in);
    double num1; 
    double num2;
    double sum;
     //Start of the calculator
    System.out.println("Multiplication");
    System.out.println("Enter a number. ");
    num1 = scan.nextDouble();
    
    System.out.println("Enter a second number. ");
    num2 = scan.nextDouble();
    
    sum = num1 * num2;
    System.out.println("Sum of: "+num1 +" and " +num2 + " = "+ sum);
    }
    
    public static void divide()
    {
         //Var and scanner
    Scanner scan = new Scanner(System.in);
    double num1; 
    double num2;
    double sum;
     //Start of the calculator
     
    System.out.println("Division");
    System.out.println("Enter a number. ");
    num1 = scan.nextDouble();
    
    System.out.println("Enter a second number. ");
    num2 = scan.nextDouble();
    
    sum = num1 / num2;
    System.out.println("Sum of: "+num1 +" and " +num2 + " = "+ sum);
    }
}
