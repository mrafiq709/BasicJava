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
public class ArrayDeque_2 {

    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for (String s : deque) {
            System.out.println(s);
        }
    //deque.poll();  
        //deque.pollFirst();//it is same as poll()  
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for (String s : deque) {
            System.out.println(s);
        }
    }

}
