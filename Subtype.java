/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning;

/**
 *
 * @author CRajika
 */
public class Subtype {
    
    //declare a method as public
    
    public void car(){
     
        System.out.println("Pet");
    }
    
    //declare a method as static
    static void dog(){
        
        System.out.println("Dog");
    }
    
    public static void main(String[] args){
    
    System.out.println("set");
    
    // car method is public so we have to create a new object to call that method
    Subtype obj = new Subtype();
    obj.car();
    
    //since dog method is static we dont want to create an object
    dog();
    }
    
}
