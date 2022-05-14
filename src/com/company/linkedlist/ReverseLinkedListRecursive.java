package com.company.linkedlist;

public class ReverseLinkedListRecursive {
    public static class ListNode {
        int val;
        ReverseLinkedList.ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ReverseLinkedList.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    static void printList (ReverseLinkedList.ListNode head) {
        ReverseLinkedList.ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    static ListNode reverseList (ListNode head) {
        // TODO: Implement recursively
        return head;
    }
    public static void main(String[] args) {

    }
}
