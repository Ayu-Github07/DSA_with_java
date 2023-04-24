package dsa_with_java.arrays;

import java.util.*;

class InverseOfArray {

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

    public static int[] inverseTheArray(int[] arr) {

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[arr[i]] = i;
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Original Array: ");
        display(arr);

        arr = inverseTheArray(arr);

        System.out.println("Inverse of an Array: ");
        display(arr);
    }

}
