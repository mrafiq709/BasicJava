/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author RAFIQ
 */
public class TreeMap_1 {

    public static void main(String args[]) {
        TreeMap<Integer, String> hm = new TreeMap<>();
        hm.put(100, "Amit");
        hm.put(102, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
