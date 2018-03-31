
// compile time polymorphism
// Overloading (Static/Compile time Polymorphism)
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
public class StaticPolymorphisom {
    
    public int add(int x, int y){  //method 1

    return x+y;

    }

    public int add(int x, int y, int z){ //method 2

    return x+y+z;

    }

    public int add(double x, int y){ //method 3

    return (int)x+y;

    }

    public int add(int x, double y){ //method 4

    return x+(int)y;

    }
    
}

class Test{

    public static void main(String[] args){

    StaticPolymorphisom demo=new StaticPolymorphisom();

    System.out.println(demo.add(2,3));      //method 1 called

    System.out.println(demo.add(2,3,4));    //method 2 called

    System.out.println(demo.add(2,3.4));    //method 4 called

    System.out.println(demo.add(2.5,3));    //method 3 called

    }

}
