/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author RAFIQ
 */
class Book3 implements Comparable<Book3> {

    int id;
    String name, author, publisher;
    int quantity;

    public Book3(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book3 b) {
        if (id > b.id) {
            return 1;
        } else if (id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class TreeSet_2 {

    public static void main(String[] args) {  
    Set<Book3> set=new TreeSet<>();  
    //Creating Books  
    Book3 b1=new Book3(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book3 b2=new Book3(233,"Operating System","Galvin","Wiley",6);  
    Book3 b3=new Book3(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to TreeSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing TreeSet  
    for(Book3 b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}
