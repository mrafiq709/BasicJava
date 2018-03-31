/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author RAFIQ
 */
public class List_Iterator {

    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1, "Sachin");
        System.out.println("element at 2nd position: " + al.get(2));
        ListIterator<String> itr = al.listIterator();
        System.out.println("traversing elements in forward direction...");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("traversing elements in backward direction...");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }

}
