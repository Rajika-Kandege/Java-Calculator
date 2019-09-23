/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3school;

/**
 *
 * @author CRajika
 */
public class W3school {
    
    
    private String name = "samar";
    
    public String getName(){
        
        return name;
    }
    public void setName(String newName){
        
        this.name = newName;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("dsgfhf");
        W3school obj = new W3school();
        obj.setName("Cham");
        System.out.println(obj.getName());
        // TODO code application logic here
    }
    
}
