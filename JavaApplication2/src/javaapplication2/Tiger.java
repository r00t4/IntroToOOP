/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Koblan
 */
public class Tiger extends Animal {

    String color;
    
    public Tiger(String name, int age, String color){
        super(name, age);
        this.color = color;
    }
    
    
    @Override
    public void eat() {
        
        //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + this.color;
    }
    
    
}
