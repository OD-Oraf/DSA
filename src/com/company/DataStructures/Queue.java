package com.company.DataStructures;

public class Queue {

    int front, rear, size;
    int capacity;
    int array[];

    public Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rear = front;
        array = new int[this.capacity];

    }

    boolean isFull (Queue queue){
        return (queue.size == queue.capacity);
    }

    boolean isEmpty(Queue queue){
        return (queue.size == 0);
    }

    //Add item into queue
    //Changes rear and size
    void enqueue(int item){
        if(isFull(this)) {
            System.out.println("This queue is full");
            return;
        }
        this.array[this.rear] = item;
        this.rear += 1;
        this.size += 1;
        System.out.println(item + " enqueued to queue");
    }

    void dequeue(){
        if(isEmpty(this)){
            System.out.println("This queue is empty");
            return;
        }
        System.out.println(this.array[this.front] +  " dequeued from queue");
        this.front += 1;
        this.size -= 1;
    }

    int front(){
        if (isEmpty(this)){
            System.out.println("THis array is empty");
            return Integer.MIN_VALUE;
        }
        return this.array[this.front];
    }

    int rear(){
        if (isEmpty(this)){
            System.out.println("THis array is empty");
            return Integer.MIN_VALUE;
        }
        return this.array[this.rear];
    }


    void printQueue(){
        System.out.print("Elements: ");
        for (int i = front; i < this.rear; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args){
        Queue queue = new Queue(100);
        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(543543);
        queue.enqueue(543);
        queue.enqueue(543);
        queue.enqueue(5435);
        queue.enqueue(6);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();
    }
}
