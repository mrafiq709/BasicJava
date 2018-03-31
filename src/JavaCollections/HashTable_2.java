/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author RAFIQ
 */
class Book9 {

    int id;
    String name, author, publisher;
    int quantity;

    public Book9(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class HashTable_2 {

    public static void main(String[] args) {
        //Creating map of Books    
        Map<Integer, Book> map = new Hashtable<>();
        //Creating Books    
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map   
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        //Traversing map  
        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }

}
