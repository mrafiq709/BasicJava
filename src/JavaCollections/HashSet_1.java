/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author RAFIQ
 */
public class HashSet_1 {

    public static void main(String args[]) {
        //Creating HashSet and adding elements  
        HashSet<String> set = new HashSet<>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        //Traversing elements  
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
