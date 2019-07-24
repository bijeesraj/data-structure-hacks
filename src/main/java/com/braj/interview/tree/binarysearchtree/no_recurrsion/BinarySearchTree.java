package com.braj.interview.tree.binarysearchtree.no_recurrsion;

public class BinarySearchTree {

    Node rootNode = null;


    public void insertNode(int value){
        Node node = new Node(value);

        if(rootNode ==null){
            rootNode = node;
            return;
        }else {
            Node focusNode = rootNode;

            while(true){
                if(value <= focusNode.value){

                    if(focusNode.leftNode==null) {
                        focusNode.leftNode = node;
                        break;
                    }else
                         focusNode= focusNode.leftNode;
                }else if(value >= focusNode.value){
                     if(focusNode.rightNode == null){
                         focusNode.rightNode = node;
                     }else{
                         focusNode = focusNode.rightNode;
                     }
                }
            }

        }

    }


}
