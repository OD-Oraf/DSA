package com.company.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode(){

    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode (int val, ListNode next) {
        this.val = val;
        this.next= next;
    }


    public static void printLinkedList(ListNode head) {
        List<Integer> output = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            output.add(curr.val);
            curr = curr.next;
        }
        System.out.println(output);
    }
}
