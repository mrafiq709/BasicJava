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
public class ArrayList_addAll {
  public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ajay");  
  ArrayList<String> al2=new ArrayList<>();  
  al2.add("Sonoo");  
  al2.add("Hanumat");  
  al.addAll(al2);//adding second list in first list  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}
