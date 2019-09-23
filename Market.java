/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRajika
 */
public class Market {
    
    public void horn(){
        
        System.out.println("main class method");
    }
    
}

class keels extends Market{
    
    public void horn(){
        
        System.out.println("the sound of swift  method declaration ");
    }
    
    public static void main(String[] args){
        
         System.out.println("this is sub classs");
         
         Market obj = new Market();
         keels obj1 = new keels();
         obj1.horn();
         obj.horn();
         
         
    }
}
        
        
