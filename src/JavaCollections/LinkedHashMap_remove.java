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
public class LinkedHashMap_remove {

    public static void main(String args[]) {
        // Create and populate linked hash map  
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Let us C");
        map.put(102, "Operating System");
        map.put(103, "Data Communication and Networking");
        System.out.println("Values before remove: " + map);
        // Remove value for key 102  
        map.remove(102);
        System.out.println("Values after remove: " + map);
    }
}
