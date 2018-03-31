/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author RAFIQ
 */
public class EnumMap_1 {

    public enum Days2 {

        Monday, Tuesday, Wednesday, Thursday
    };

    public static void main(String[] args) {
        EnumMap<Days2, String> map;
        map = new EnumMap<>(Days2.class);
        map.put(Days2.Monday, "1");
        map.put(Days2.Tuesday, "2");
        map.put(Days2.Wednesday, "3");
        map.put(Days2.Thursday, "4");
        // print the map  
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
