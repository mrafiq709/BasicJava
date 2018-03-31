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
public class TreeMap_remove {

    public static void main(String args[]) {
        // Create and populate tree map  
        Map<Integer, String> map = new TreeMap<>();
        map.put(102, "Let us C");
        map.put(103, "Operating System");
        map.put(101, "Data Communication and Networking");
        System.out.println("Values before remove: " + map);
        // Remove value for key 102  
        map.remove(102);
        System.out.println("Values after remove: " + map);
    }
}
