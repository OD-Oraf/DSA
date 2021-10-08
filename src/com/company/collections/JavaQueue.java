package com.company.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueue {

    public static class Book implements Comparable<Book>{
        int id;
        String name, author, publisher;
        int quantity;

        public Book(int id, String name, String author, String publisher, int quantity) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
        }

        @Override
        public int compareTo(Book o) {
            if(this.id > o.id){
                return 1;
            }else if(this.id < o.id){
                return -1;
            }else{
                return 0;
            }
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", publisher='" + publisher + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }

    public static void main(String[] args){








        Queue<Book> bookQueue = new PriorityQueue<>();
        Book b1= new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2= new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3 =new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        bookQueue.add(b1);
        bookQueue.add(b2);
        bookQueue.add(b3);


        //Traverse
        System.out.println("Queue before poll");
        for(Book b : bookQueue){
            System.out.println(b);
        }

        bookQueue.poll();
        System.out.println("");

        System.out.println("Queue after poll");
        for(Book b : bookQueue){
            System.out.println(b);
        }

    }
}
