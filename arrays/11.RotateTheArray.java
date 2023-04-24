package dsa_with_java.arrays;

import java.util.*;

class RotateTheArray {

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

    public static int[] rotateTheArrrayByK(int[] arr, int k) {

        k %= arr.length;

        int[] first = new int[k];
        int[] second = new int[arr.length - k];

        int j = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
            first[j] = arr[i];
            j++;
        }

        j = 0;

        for (int i = 0; i <= arr.length - k - 1; i++) {
            second[j] = arr[i];
            j++;
        }

        j = 0;
        for (int i = 0; i < first.length; i++) {
            arr[j++] = first[i];
        }

        for (int i = 0; i < second.length; i++) {
            arr[j++] = second[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] arr = createArray(size);

        int k;
        System.out.println("Rotate the array : ");
        k = sc.nextInt();

        System.out.println("Original Array: ");
        display(arr);

        arr = rotateTheArrrayByK(arr, k);

        System.out.println("Array after rotation: ");
        display(arr);

    }

}
