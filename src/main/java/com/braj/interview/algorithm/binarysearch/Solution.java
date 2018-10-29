package com.braj.interview.algorithm.binarysearch;

import java.util.Arrays;


//https://www.youtube.com/watch?v=P3YID7liBug

public class Solution {

    static int count = 0;

    public static void main(String[] args) {
        int[] numbers = {1,5,4,2,3,7,8,9};
        Arrays.sort(numbers);
        System.out.println("10 Found = " + binarySearchRecursiveIsElementExists(numbers,10));
        System.out.println("4 Found = " + binarySearchRecursiveIsElementExists(numbers,10));
    }

    public static boolean binarySearchRecursiveIsElementExists(int[] array, int x){
        return binarySearchRecursive(array,x,0,array.length-1);
    }

    public static boolean binarySearchRecursive(int[] array, int x, int left , int right){
        System.out.println(++count);
        boolean found = false;
        if(left>right){
            return false;
        }
        int mid = (left+right)/2;

        if(array[mid]==x){
            found = true;
        }else if(x<array[mid]) {
            found= binarySearchRecursive(array,x,0,mid-1);
        }else {
            found=binarySearchRecursive(array,x,mid+1,right);
        }
        return found;
    }
}
