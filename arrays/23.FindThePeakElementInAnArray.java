package dsa_with_java.arrays;

import java.util.*;

/*
 * A peak element is an element that is strictly greater than its neighbors.
 * Given a 0-indexed integer array nums, find a peak element, and return its index. If the array
 * contains multiple peaks, return the index to any of the peaks.
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be
 * strictly greater than a neighbor that is outside the array.
 * You must write an algorithm that runs in O(log n) time.
 * 
 * I/P:
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 */

class FindThePeakElementInAnArray {

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

    public static int searchThePeakElementIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return start;
    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = createArray(size);

        int index = searchThePeakElementIndex(arr);

        System.out.println("Original Array : ");
        display(arr);
        System.out.println("Element at the peak is present at the index :" + index);

    }

}
