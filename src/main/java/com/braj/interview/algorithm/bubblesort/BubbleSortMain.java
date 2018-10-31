package com.braj.interview.algorithm.bubblesort;

//https://www.youtube.com/watch?v=F13_wsHDIG4
public class BubbleSortMain {

    public static void main(String[] args) {

        int[] numbers = {1,2,17,22,91,4,32,8,9,3,24,7};
        System.out.println("Length : " + numbers.length);
        numbers = bubbleSort(numbers);
        System.out.println("Length : " + numbers.length);
        for (int i = 0; i <= (numbers.length-1) ; i++) {
            System.out.println(numbers[i]);
        }
    }

    // Compare each element with immediate next element.
    private static int[] bubbleSort(int[] numbers) {
        int temp;
        for(int i=0; i<numbers.length-1;i++){ // You will need to no n number of iteration
            for(int j=0; j<numbers.length-1-i;j++){  // Work on nth and n+1 th element.
                if(numbers[j] > numbers[j+1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }
}
