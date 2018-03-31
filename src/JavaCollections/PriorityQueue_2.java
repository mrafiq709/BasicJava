/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author RAFIQ
 */
class Book4 implements Comparable<Book4> {

    int id;
    String name, author, publisher;
    int quantity;

    public Book4(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book4 b) {
        if (id > b.id) {
            return 1;
        } else if (id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class PriorityQueue_2 {

    public static void main(String[] args) {
        Queue<Book4> queue = new PriorityQueue<>();
        //Creating Books  
        Book4 b1 = new Book4(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book4 b2 = new Book4(233, "Operating System", "Galvin", "Wiley", 6);
        Book4 b3 = new Book4(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        //Adding Books to the queue  
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements  
        for (Book4 b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        queue.remove();
        System.out.println("After removing one book record:");
        for (Book4 b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
