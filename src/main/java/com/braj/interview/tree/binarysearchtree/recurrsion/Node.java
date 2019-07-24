package com.braj.interview.tree.binarysearchtree.recurrsion;


//Binary Search Tree implementation
public class Node {

    private Node left,right;
    private int data;

    public Node(int data) {
        this.data = data;
    }


    // Note the recursive insert Operation.
    public void insert(int value){
        if(value<=this.data){
            if(left==null){
                this.left=new Node(value);
            }else {
                this.left.insert(value); // This is important
            }
        }else if(value>this.data){
            if(right==null){
                this.right = new Node(value);
            }else {
                this.right.insert(value);
            }
        }

    }

    // Find if a value exist
    public boolean contains(int value) {
        if (data == value) {
            return true;
        } else if (value <= data) {
            if (left == null) {
                return false;
            } else {
                return this.left.contains(value);
            }
        } else if (value > data) {
            if (right == null) {
                return false;
            } else {
                return this.right.contains(value);
            }
        }
        return false;
    }

    //Left --- Root -- Right
    public void printInOrder(){
        if(this.left!=null){
            this.left.printInOrder();
        }
        System.out.print(" " +data);
        if(right!=null){
            this.right.printInOrder();
        }
    }

    //Root .. Left ... Right
    public void printPreOrder(){
        System.out.print(" " +data);
        if(left!=null){
            this.left.printPreOrder();
        }if(right!=null){
            this.right.printPreOrder();
        }
    }

    //Left ... Right .. Root
    public void printPostOrder(){
        if(left!=null){
            this.left.printPostOrder();
        }
        if(right!=null){
            this.right.printPostOrder();
        }
        System.out.print(" " +data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "left=" + left +
                ", right=" + right +
                ", data=" + data +
                '}';
    }
}
