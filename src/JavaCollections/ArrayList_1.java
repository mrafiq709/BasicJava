/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author RAFIQ
 */
public class ArrayList_1 {
    public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<>();//Creating arraylist  
  list.add("Ravi");//Adding object in arraylist  
  list.add("Vijay");  
  list.add("Ravi");  
  list.add("Ajay");  
  //Traversing list through Iterator  
  
  Iterator itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }
  
  //list.stream().forEach(System.out::println);
  
  /*for(String obj:list)  
    System.out.println(obj);*/  
 }     
}
