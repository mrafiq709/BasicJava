/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author RAFIQ
 */
public class ArrayDeque_1 {

    public static void main(String[] args) {
        //Creating Deque and adding elements  
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        //Traversing elements  
        for (String str : deque) {
            System.out.println(str);
        }
    }

}
