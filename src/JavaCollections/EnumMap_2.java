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
class Book11 {

    int id;
    String name, author, publisher;
    int quantity;

    public Book11(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class EnumMap_2 {

    public enum Key {

        One, Two, Three
    };

    public static void main(String[] args) {
        EnumMap<Key, Book11> map = new EnumMap<>(Key.class);
        // Creating Books    
        Book11 b1 = new Book11(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book11 b2 = new Book11(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book11 b3 = new Book11(103, "Operating System", "Galvin", "Wiley", 6);
        // Adding Books to Map   
        map.put(Key.One, b1);
        map.put(Key.Two, b2);
        map.put(Key.Three, b3);
        // Traversing EnumMap  
        for (Map.Entry<Key, Book11> entry : map.entrySet()) {
            Book11 b = entry.getValue();
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
