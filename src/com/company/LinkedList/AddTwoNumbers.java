package com.company.LinkedList;

//Leetcode 2
public class AddTwoNumbers {

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode() {
        }
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2){

        ListNode newHead = new ListNode(0);
        ListNode l3 = newHead;

        int carry = 0;
        while (l1 != null || l2 != null){
            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;

            int currentSum = l1Val + l2Val + carry;
            carry = currentSum / 10;
            int lastDigit = currentSum % 10;

            ListNode newNode = new ListNode(lastDigit);
            l3.next = newNode;

            if (l1 != null) l1 = l1.next;
            if (l1 != null) l2 = l3.next;
            l3 = l3.next;
        }

        if (carry > 0){
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = l3.next;
        }

        return newHead.next;
    }

    public static void main(String[] args){

    }


}
