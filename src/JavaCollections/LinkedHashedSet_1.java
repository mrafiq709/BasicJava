/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author RAFIQ
 */
public class LinkedHashedSet_1 {

    public static void main(String args[]) {
        LinkedHashSet<String> al = new LinkedHashSet<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
