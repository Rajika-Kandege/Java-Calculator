/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRajika
 */
public class Constructor {
    
    public Constructor(){
        
        
        System.out.println("This is first contructor");
    }
    
    public Constructor(String name){
        
          
        System.out.println("This is second  contructor and it has  a variable " + name);
    }
    
    public Constructor(String name, int age){
        System.out.println("This is third  contructor and it has two variables " + name +" "+ age);
        
    }
    
    public static void main(String[] args){
        
        Constructor C1 =  new Constructor();
        Constructor C2 =  new Constructor("Chim");
        Constructor C3 =  new Constructor("Cham", 56);
        
        
        
        
    }
    
}
