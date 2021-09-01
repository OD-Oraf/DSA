package com.company.dataStructures;

public class Stack {

    int capacity = 1000;
    int top = -1;
    int[] arr = new int[capacity];

    Stack(){

    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public void push(int val){
        if (top == capacity){
            System.out.println("Stack overflow");
            return;
        }
        top += 1;
        arr[this.top] = val;

    }

    public void peek(){
        if (top < 0){
            System.out.println("Empty stack");
            return;
        }
        System.out.println("Current top value is: " + arr[top]);
    }

    public void pop(){
        if (top < 0){
            System.out.println("Empty Stack");
            return;
        }
        top -= 1;
    }

    public void printStack(){
        if (top >= 0) {
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(90);
        stack.push(24);
        stack.push(42);
        stack.push(432);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
        stack.printStack();
    }
}
