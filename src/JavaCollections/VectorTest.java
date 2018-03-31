/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author RAFIQ
 */
public class VectorTest {

    public static void main(String args[]) {
        Vector<String> v = new Vector<>();//creating vector  
        v.add("umesh");//method of Collection  
        v.addElement("irfan");//method of VectorTest  
        v.addElement("kumar");
        //traversing elements using Enumeration  
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
