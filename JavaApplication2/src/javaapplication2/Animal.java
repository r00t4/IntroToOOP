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
public abstract class Animal {
    public String name;
    public int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void oneYearLater(){
        this.age++;
    }
    
    public abstract void eat();
    
    @Override
    public String toString(){
        return this.name + " " + this.age;
    }
}
