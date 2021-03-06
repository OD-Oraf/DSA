package com.company.linkedlist;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    static void printList (ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    static ListNode reverseList (ListNode head) {

        ListNode newHead = null;
        ListNode curr = head;

        while (curr != null) {
            //
            ListNode temp = curr.next;
            curr.next = newHead;
            newHead = curr;

            curr = temp;
        }

        return newHead;

    }
    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printList(reverseList(node1));



    }
}
