/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.HashSet;

/**
 *
 * @author RAFIQ
 */
class Book1 {

    int id;
    String name, author, publisher;
    int quantity;

    public Book1(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class HashSet_2 {

    public static void main(String[] args) {
        HashSet<Book1> set = new HashSet<>();
        //Creating Books  
        Book1 b1 = new Book1(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book1 b2 = new Book1(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book1 b3 = new Book1(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to HashSet  
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing HashSet  
        for (Book1 b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
