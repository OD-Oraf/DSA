package com.company.linked.list;

public class LinkedListCycle {
    static class Node{
        int data;
        Node next;

        Node(int temp){
            data = temp;
        }
    }

    //2 Pointers
    static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        Node n1 = new Node(34);
        Node n2 = new Node(25);
        Node n3 = new Node(31);
        Node n4 = new Node(56);
        Node n5 = new Node(45);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        //Loop
        n5.next = n3;

        System.out.println(hasCycle(n1));
    }
}
