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
public class TigerJunior extends Tiger{
    
    public TigerJunior(String name, int age, String color){
        super(name, age, color);
    }
    
    @Override
    public void oneYearLater(){
        this.age += 4;
    }
    
}
