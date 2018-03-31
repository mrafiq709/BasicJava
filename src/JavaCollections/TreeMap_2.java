/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author RAFIQ
 */
class Book8 {

    int id;
    String name, author, publisher;
    int quantity;

    public Book8(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class TreeMap_2 {

    public static void main(String[] args) {
        //Creating map of Books    
        Map<Integer, Book8> map = new TreeMap<>();
        //Creating Books    
        Book8 b1 = new Book8(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book8 b2 = new Book8(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book8 b3 = new Book8(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map   
        map.put(2, b2);
        map.put(1, b1);
        map.put(3, b3);

        //Traversing map  
        for (Map.Entry<Integer, Book8> entry : map.entrySet()) {
            int key = entry.getKey();
            Book8 b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
