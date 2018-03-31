/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author RAFIQ
 */
public class ComparableInterface {

    public static void main(String args[]) {
        ArrayList<Student1> al = new ArrayList<>();
        al.add(new Student1(101, "Vijay", 23));
        al.add(new Student1(106, "Ajay", 27));
        al.add(new Student1(105, "Jai", 21));

        Collections.sort(al);
        for (Student1 st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
