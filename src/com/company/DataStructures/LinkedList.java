package com.company.DataStructures;

public class LinkedList {

    //head  of list
    Node head = null;
    int size = 0;

    static class Node{
        int val;
        Node next;
        public Node(){}
        public Node(int val){
            this.val = val;
        }
    }

    //Add to front
    public void push(int val){

        //Create new node
        Node newNode = new Node(val);
        if (this.head == null){
            this.head = newNode;
        } else {
            //point new node to current head
            newNode.next = head;
            //set new node to current head
            head = newNode;
        }
    }
    public void append(int val){
        Node newNode = new Node(val);
        if (this.head == null){
            this.head = newNode;
        } else {

            Node curr = this.head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    //More efficient delete
    public void delete(int deleteVal){
        Node curr = head;
        Node prev = null;
        if (curr == null){
            System.out.println("Head does not exist");
            return;
        }
        //If head val is the delete val
        if (curr.val == deleteVal){
            head = curr.next;
            return;
        }
        //Traverse through list until we hit deleteVal or end
        while (curr.next != null){
            curr = curr.next;
            prev = curr;
            if (curr.val == deleteVal){
                prev.next = curr.next;
                break;
            }
        }
        if (curr == null){
            System.out.println("Value not present in list");
        }

    }

    public int size(){
        //incase size is called multiple times in an instance
        size = 0;

        Node curr = this.head;
        while (curr != null){
            size += 1;
            curr = curr.next;
        }
        return this.size;
    }
    public int getSize(){
        return this.size();
    }

//    public void delete(int deleteVal){
//        Node curr = this.head;
//        if (curr == null){
//            System.out.println("List missing head");
//        } else {
//            while (curr.next != null){
//                //Delete head node
//                if (curr.val == deleteVal){
//                    this.head = curr.next;
//                    break;
//                }
//                //Delete not head node
//                if (curr.next.val == deleteVal){
//                    curr.next = curr.next.next;
//                    break;
//                }
//                System.out.println("List does not contain deleteValue");
//            }
//        }
//    }



    void printList(){
        Node curr = this.head;
        while (curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
        System.out.println("List size at last print: " + this.size());

    }


    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.append(2);
        ll.append(2);
        ll.push(3);
        ll.delete(3);
        ll.append(5);
        ll.printList();
        System.out.println(ll.getSize());

    }




}
