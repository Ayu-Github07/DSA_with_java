package dsa_with_java.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * First of all you will get a number n, which indicates the length of an array. 
 * Then you will get n more inputs corresponding to each index of the array.
 * And you are required to find the span of the array, 
 * which is defined as the difference between max and min value of the array.
 */

class SpanOfArray {

    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int spanOfArray(int[] arr) {

        int maxValue = arr[0];
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxValue = ((maxValue < arr[i]) ? maxValue = arr[i] : maxValue);
            minValue = ((minValue > arr[i]) ? minValue = arr[i] : minValue);
        }
        return maxValue - minValue;

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Original Array : ");
            display(arr);

            System.out.println("Span of the Array is : " + spanOfArray(arr));
        }

    }

}
