/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author RAFIQ
 */
public class TreeSet_1 {

    public static void main(String args[]) {
        //Creating and adding elements  
        TreeSet<String> al = new TreeSet<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing elements  
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
