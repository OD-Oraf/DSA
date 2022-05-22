package com.company.trees;

public class BinarySearchTree {
    TreeNode root;


    public BinarySearchTree() {
        root = null;
    }
    public void insert (int val) {
        root = insertVal(root, val);
    }

    TreeNode insertVal(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertVal(root.left, val);
        } else if (val > root.val) {
            root.right = insertVal(root.right, val);
        }

        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.val + " -> ");
            inorderRec(root.right);
        }
    }





}
