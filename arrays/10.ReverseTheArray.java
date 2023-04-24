package dsa_with_java.arrays;

import java.util.Arrays;
import java.util.Scanner;

class ReverseTheArray {

    public static Scanner sc = new Scanner(System.in);

    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] createArray(int size) {

        int[] arr = new int[size];
        System.out.println("Enter the array of size : " + size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] reverseOfArray(int[] arr) {

        int i = 0, j = arr.length - 1;

        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }

        return arr;

    }

    public static void main(String[] args) {

        System.out.println("Enter the size of array :");
        int size1 = sc.nextInt();
        int[] arr1 = createArray(size1);

        System.out.println("Original Array: ");
        display(arr1);

        reverseOfArray(arr1);
        System.out.println("Reverse of an array: ");
        display(arr1);

    }

}
