package com.braj.interview.tree.binarysearchtree.no_recurrsion;

public class Node {

    public int value;
    public Node leftNode;
    public Node rightNode;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }



}
