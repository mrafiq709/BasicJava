/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author RAFIQ
 */
class Book5 {

    int id;
    String name, author, publisher;
    int quantity;

    public Book5(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class ArrayDeque_3 {

    public static void main(String[] args) {
        Deque<Book5> set = new ArrayDeque<>();
        //Creating Books    
        Book5 b1 = new Book5(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book5 b2 = new Book5(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book5 b3 = new Book5(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to Deque   
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing ArrayDeque  
        for (Book5 b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
