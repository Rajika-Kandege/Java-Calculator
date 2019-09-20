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
public class Animal {
    
    
    public void animalsound(){
    
    System.out.println("Peek peek");
    }
    
}

 class Cat extends Animal {
     
     public void animalsound(){
         System.out.println("meow meow");
         
     }


}

class Duck extends Animal {
     
     public void animalsound(){
         System.out.println("Thap thap");
         
     }


}

class MainClass {
public static void main(String[] args){
    
    System.out.println("hello animals");
    
    Animal a1 = new Animal();
    Cat c1 = new Cat();
    Duck d1 =  new Duck();
    
    c1.animalsound();
    d1.animalsound();
    a1.animalsound();
}

}



