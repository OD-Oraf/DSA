package com.company.dataStructures;

public class BinarySearchTree {
    class Node{
        int val;
        Node left, right;

        public Node(int val){
            this.val= val;
            left = right = null;
        }
    }

    //Root Node
    Node root;
    BinarySearchTree(){
        root = null;
    }



    //Essentially maps the pointers and returns root
    Node insertRec(Node root, int val){
        if (root == null){
            root = new Node(val);
            return root;
        }
        if (val < root.val){
            root.left = insertRec(root.left, val);
        } else if (val > root.val){
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    //Actually runs the insert function
    void insert (int val){
        //insert recursively
        root = insertRec(root ,val);
    }

    void inorderRec(Node root){
        if (root != null){
            inorderRec(root.left);
            System.out.println(root.val);
            inorderRec(root.right);
        }

    }

    void inorder(){
        inorderRec(root);
    }

    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(40);
        tree.insert(334);
        tree.insert(342);

        tree.inorder();
    }
}
