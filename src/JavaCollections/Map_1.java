/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RAFIQ
 */
public class Map_1 {

    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        System.out.println(""+map.get(102));
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
