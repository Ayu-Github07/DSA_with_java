package dsa_with_java.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * First of all you will get a number n, which indicates the length of an array. Then you will get
 * more inputs corresponding to each index of the array.
 * After that you will be given one more input, d as data, for which you have to find, at which index
 * of array d is present. And in case d is not present in the array then you need to print -1.
 * 
 */

class FindAnElement {

    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int findAnElement(int[] arr, int data) {

        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int data = sc.nextInt();

            System.out.println("Original Array : ");
            display(arr);

            int ans = findAnElement(arr, data);

            if (ans == -1) {
                System.out.println("Element " + data + " is not present in the array");
            } else {
                System.out.println("Element " + data + " is present at the index :" + ans);
            }
        }

    }

}
