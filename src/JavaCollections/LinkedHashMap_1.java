/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author RAFIQ
 */
public class LinkedHashMap_1 {

    public static void main(String args[]) {

        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();

        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
