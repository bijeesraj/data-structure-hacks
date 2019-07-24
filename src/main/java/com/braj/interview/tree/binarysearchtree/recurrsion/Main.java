package com.braj.interview.tree.binarysearchtree.recurrsion;

public class Main {

    /**
                10
              /    \
             8      16
              \
               6

    **/

    public static void main(String[] args) {

        //Insert Node in Binary Search Tree
        Node node = new Node(10);
        node.insert(8);
        node.insert(6);
        node.insert(16);
        System.out.println("node = " + node);

        // Check if a value exists
        System.out.println("16 Exists = " + node.contains(16));
        System.out.println("161 Exists = " + node.contains(161));

        //Traversing
        System.out.println("In Order Traversing : ");
        node.printInOrder();

        System.out.println("Pre Order Traversing : ");
        node.printPreOrder();

        System.out.println("Post Order Traversing : ");
        node.printPostOrder();

    }
}
