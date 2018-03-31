/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author RAFIQ
 */
public class Collection_max {
    public static void main(String a[]){         
        List<Integer> list = new ArrayList<>();  
        list.add(46);  
        list.add(67);  
        list.add(24);  
        list.add(16);  
        list.add(8);  
        list.add(12);  
        System.out.println("Value of maximum element from the collection: "+Collections.max(list));
        System.out.println("Value of maximum element from the collection: "+Collections.min(list));
    }  
}
