/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRajika
 */
public class People {
    
    int age ;
    String name;
    
    //create method
    void myself(){
    System.out.println("Hi I am " + name);
    }
    
    public static void main(String[] args){
        
        //create objects p1 and p2
    
        People p1 = new People();
        p1.age = 34;
        p1.name = "Lotus";
        
        //call method then it will do what has initialize inside the method
        
        p1.myself();
        People p2 =  new People();
        p2.age =  56;
        p2.name = "benjamin";
        p2.myself();
        
        System.out.println(p1.age);
        System.out.println(p2.age);
        System.out.println(p2.name);
        System.out.println(p1.name);
        
    
    }
    
}
