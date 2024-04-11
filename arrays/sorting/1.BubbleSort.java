package dsa_with_java.arrays.sorting;

import java.util.*;

class BubbleSort {

    public static Scanner sc = new Scanner(System.in);

    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        return arr;

    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] createArray(int size) {

        int[] arr = new int[size];
        System.out.println("Enter the array of size : " + size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {

        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Original Array : ");
        display(arr);

        arr = bubbleSort(arr);
        System.out.println("Array after sorting : ");
        display(arr);
    }

}
