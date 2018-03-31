/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjava;

/**
 *
 * @author RAFIQ
 */

abstract class Animal {
    String name;  
    abstract String sound(); //all classes that implement Animal must have a sound method
}

class Cat extends Animal{

    public Cat() {
        this.name = "Garfield";        
    }    
    
    @Override
    public String sound(){ //implemented sound method from the abstract class & method
        return "Mew";
    }
}

public class AbstratcClassMethod{
    public static void main(String[] args) {
        Animal ob = new Cat();
        System.out.println(ob.name + " " + ob.sound());
    }
}
