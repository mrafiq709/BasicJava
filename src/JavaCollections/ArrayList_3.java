/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;

/**
 *
 * @author RAFIQ
 */
public class ArrayList_3 {

    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1, "Sachin");
        System.out.println("Element at 2nd position: " + al.get(2));
        for (String s : al) {
            System.out.println(s);
        }
    }
}
