/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.EnumSet;
import java.util.Set;

/**
 *
 * @author RAFIQ
 */

enum days1 {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSet_2 {
    public static void main(String[] args) {  
    Set<days1> set1 = EnumSet.allOf(days1.class);  
      System.out.println("Week Days:"+set1);  
      Set<days1> set2 = EnumSet.noneOf(days1.class);  
      System.out.println("Week Days:"+set2);     
  }  
}
