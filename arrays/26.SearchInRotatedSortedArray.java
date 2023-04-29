package dsa_with_java.arrays;

import java.util.*;

class SearchInRotatedSortedArray {

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

    public static int search(int[] arr, int target) {

        int peakElementIndex = searchThePeakElementIndex(arr);

        if (peakElementIndex == -1) {
            return binarySearchInMountainArray(arr, target, 0, arr.length - 1);
        }

        int index = binarySearchInMountainArray(arr, target, 0, peakElementIndex);
        if (index != -1) {
            return index;
        }
        return binarySearchInMountainArray(arr, target, peakElementIndex + 1, arr.length - 1);

    }

    public static int binarySearchInMountainArray(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;

    }

    public static int searchThePeakElementIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Enter the element to be searched for in the array:");
        int data = sc.nextInt();

        int index = search(arr, data);

        System.out.println("Original Array : ");
        display(arr);

        if (index != -1) {
            System.out.println("Element " + data + " is present in the minimum index of:" + index);
        } else {
            System.out.println("Element " + data + " is not present in the array");
        }
    }

}
