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

interface Anim{
    public void eat();
    public void travel();
}

public class InterfacesMamal implements Anim, NewInterface {
    
    @Override
    public void eat() {
      System.out.println("Mammal eats");
   }

   @Override
   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      InterfacesMamal m = new InterfacesMamal();
      m.eat();
      m.travel();
      m.ddd();
   }

    @Override
    public void ddd() {
        System.out.println("From New Inteface !!!");
    }
    
}
