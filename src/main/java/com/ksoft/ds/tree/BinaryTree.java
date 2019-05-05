package com.ksoft.ds.tree;

import java.util.*;

/**
 * Binary Tree Operations
 * 1. Inserting Elements
 * 2. Finding An Element
 * 3. Deleting an Element
 * 4. Traversing
 *  a) In-Order
 *  b) Pre-Order
 *  c) Post-Order
 */
public class BinaryTree {

    TreeNode root;

    /**
     * Display - Left - Right
     * 1. Visit root node
     * 2. Visit all the nodes in the left subtree
     * 3. Visit all the nodes in the right subtree
     * @param root
     */
    public void preOrderRecursive(TreeNode root){
        if(root==null)
            return;
        System.out.println(root.data);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }


    /**
     * Left - Display - Right
     * 1. First, visit all the nodes in the left subtree
     * 2. Then the root node
     * 3. Visit all the nodes in the right subtree
     * @param root
     */
    public void inOrderRecursive(TreeNode root){
        if(root==null)
            return;
        inOrderRecursive(root.left);
        System.out.println(root.data);
        inOrderRecursive(root.right);
    }

    /**
     * Left,  Right, Display
     * 1. Visit all the nodes in the left subtree
     * 2. Visit the root node
     * 3. Visit all the nodes in the right subtree
     * @param root
     */
    public void postOrderRecursive(TreeNode root){
        if(root==null)
            return;
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.println(root.data);

    }

    /**
     * 1. Visit or display the current node (root) & push to stack
     * 2. Traverse to left, print and push stack
     * 3. Pop from stack and go to right when root is null and stack is not empty.
     *
     *  @param root
     */
    public void preOrderNoRecursive(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while(true){

            while(root!=null){
                System.out.println(root.data);
                stack.push(root);
                root = root.left;
            }

            if(stack.isEmpty())
                break;
            root  = stack.pop();
            root = root.right;

        }
    }

    /**
     *
     * @param root
     */
    public void inOrderNoRecursive(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        while(true){

            while(root!=null){
                stack.push(root);
                root = root.left;
            }

            if(stack.isEmpty())
                break;
            root  = stack.pop();
            System.out.println(root.data);
            root = root.right;

        }
    }

    /**
     *
     * @param root
     */
    public void postOrderNoRecursive(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode previous = null;

        do {

            while (root!=null){
                stack.push(root);
                root = root.left;
            }
            while (root==null && !stack.isEmpty()){
                root = stack.peek();
                if(root.right==null || root.right==previous){
                    System.out.println(root.data);
                    stack.pop();

                    previous = root;
                    root = null;
                }else{
                    root = root.right;
                }
            }

        }while (!stack.isEmpty());

    }


    public void levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode temp = null;
        if(root==null)
            return;
        queue.add(root);
        while (!queue.isEmpty()){
            temp = queue.poll();
            System.out.println(temp.data);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }

    }
}
