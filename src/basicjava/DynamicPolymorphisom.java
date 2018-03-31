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

// Overloading is Dynamic Polymorphism

class Vehicle{

    public void move(){

    System.out.println("Vehicles can move!!");

    }

}

class MotorBike extends Vehicle{

    @Override
    public void move(){

    System.out.println("MotorBike can move and accelerate too!!");

    }

}

public class DynamicPolymorphisom {
    public static void main(String[] args){

    Vehicle vh=new MotorBike();

    vh.move();    // prints MotorBike can move and accelerate too!!

    vh=new Vehicle();

    vh.move();    // prints Vehicles can move!!

    }
}
