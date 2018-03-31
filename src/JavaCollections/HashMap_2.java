/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RAFIQ
 */
class Book6 {

    int id;
    String name, author, publisher;
    int quantity;

    public Book6(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class HashMap_2 {

    public static void main(String[] args) {
        //Creating map of Books    
        Map<Integer, Book6> map = new HashMap<>();
        //Creating Books    
        Book6 b1 = new Book6(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book6 b2 = new Book6(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book6 b3 = new Book6(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map   
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        
        //System.out.println("" + map.get(1).name);

        //Traversing map  
        for (Map.Entry<Integer, Book6> entry : map.entrySet()) {
            int key = entry.getKey();
            Book6 b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
