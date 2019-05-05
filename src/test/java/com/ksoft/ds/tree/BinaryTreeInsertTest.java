package com.ksoft.ds.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeInsertTest {

    BinaryTree tree = new BinaryTree();

    @Before
    public void setup(){
        tree.root=new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
    }

    @Test
    public void testPreOreder(){
        tree.preOrderRecursive(tree.root);
    }

    @Test
    public void testInOreder(){
        tree.inOrderRecursive(tree.root);
    }

    @Test
    public void testPostOreder(){
        tree.postOrderRecursive(tree.root);
    }

    @Test
    public void testPreOrderWithoutRecursive(){
        tree.preOrderNoRecursive(tree.root);
    }
    @Test
    public void testInOrderWithoutRecursive(){
        tree.inOrderNoRecursive(tree.root);
    }

    @Test
    public void testPostOrderWithoutRecursive(){
        tree.postOrderNoRecursive(tree.root);
    }
    @Test
    public void testLevelOrder(){
        tree.levelOrder(tree.root);
    }
}