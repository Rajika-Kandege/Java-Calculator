/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning;
import java.util.Scanner;
/**
 *
 * @author CRajika
 */
public class Learning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a  ;
        int b ;
        char c;
        double output = 0;
        
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter A");
        a = scan.nextInt();
        System.out.println("Enter B");
        b = scan.nextInt();
        System.out.println("Enter operator");
        c = scan.next().charAt(0);
        
        switch(c){
        
            case '+':
                output = a + b;
                break;
            case '-':
                output = a - b;
                break;
            case '*':
               output = a * b;
                break;
            case '/':
                output = a / b;
                break;
                        
        }
        
        System.out.println(a+" "+c+" "+b+": output is  " + output);
        
        
        
        
        
        
    /**
     *
     */
    
        
        
    }
    
}
