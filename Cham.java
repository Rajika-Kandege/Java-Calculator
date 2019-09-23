/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRajika
 */
public class Cham {
    
    int x;
    //create constructor
    
    public Cham(int y ){
        
        x =  y;
    
    System.out.println("This is constructor " + x);
}
    
    //create new method
public void wash(int d){
    System.out.println("wash " + d);
    
}
//create method with static 
static void lamb(String t){
    
    System.out.println("lamb " + t );
}
   
    
    
    public static void main(String[] args){
        
        
        System.out.println("hey");
        
        Cham obj = new Cham(6);
        System.out.println(obj.x);
        obj.wash(5);
        obj.lamb("test string");
        //can call  method without creating an object
        lamb("cham cham cham");
        
    }
    
}
