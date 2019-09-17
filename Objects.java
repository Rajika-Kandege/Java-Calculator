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
    
    
    public static void main(String[] args){
    
        People p1 = new People();
        p1.age = 34;
        p1.name = "Lotus";
        People p2 =  new People();
        p2.age =  56;
        p2.name = "benjamin";
        
        System.out.println(p1.age);
        System.out.println(p2.age);
        System.out.println(p2.name);
        System.out.println(p1.name);
        
    
    }
    
}
