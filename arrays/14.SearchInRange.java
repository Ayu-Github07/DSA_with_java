package dsa_with_java.arrays;

import java.util.*;
/*
 * Search in a range of array for an element
 * 
 */

class SearchInRange {

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

    public static boolean searchInRange(int[] arr, int value, int start, int end) {

        if (start > arr.length && end < 0) {
            return false;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Starting index: ");
        int start = sc.nextInt();

        System.out.println("Ending index: ");
        int end = sc.nextInt();

        System.out.println("Value to be searched for: ");
        int value = sc.nextInt();

        System.out.println("Original Array: ");
        display(arr);

        boolean ans = searchInRange(arr, value, start, end);

        if (ans) {
            System.out.println("Element is present in the desired range!");
        } else {
            System.out.println("Element is not present in the desired range!");
        }
    }

}
