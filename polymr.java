/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymor;

/**
 *
 * @author CRajika
 */

//decalre main class
 class Maincham {

     public int speed ;
     // declare method inside the main class
    
    public void carname(){
        
        
        System.out.println("This is main car");
    }
    
}
    //declare sub class
    class swift extends Maincham{
        
        //declare method as polymorphism 
 
        public void carname(int speedswift){
            
             speed = speedswift;
            System.out.println("This is Swift " + speedswift);
            
        }
        
    }
    class civic extends Maincham{
        
        //declare method as polymorphism 
 
        public void carname(int speedcivic ){
            
             speed = speedcivic;
            System.out.println("This is civic " +speedcivic );
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
        public class  Polymor{
    public static void main(String[] args) {
        System.out.println("This is main car"); 
        
        swift obj1 =  new swift();
        civic obj2 =  new civic();
        obj1.carname(345);
        obj2.carname(666);
    }
    
    
}
