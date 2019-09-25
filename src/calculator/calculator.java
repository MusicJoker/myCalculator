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
public class calculator {
    
    public static void main(String[] args){
        backBone Cal = new backBone();
 
        Scanner scan = new Scanner(System.in);
        int Add = 1 ;
        int subtract = 2;
        int multiply = 3;
        int divide = 4;
        int input;
           
        System.out.println("Hello and welcome! to my calculator");
        System.out.println("Pleae select one of the following number." + '\n'+ '\n'+
                "For Addition please enter 1 " + '\n'+
                "For Subtraction please enter 2" + '\n'+
                "For Multiplication please enter 3" + '\n'+
                "For Division please enter 4"+'\n');
        input = scan.nextInt();
        
                
        if(input == Add){
            backBone.sum();
        }
        else if(input == subtract){
            backBone.subtract();
        }
        else if(input == multiply){
            backBone.multiply();
        }
        else if(input == divide){
            backBone.divide();
        }
        else {
            
            System.out.println("Please select a number from the list.");
            
            
        }
     }
}
