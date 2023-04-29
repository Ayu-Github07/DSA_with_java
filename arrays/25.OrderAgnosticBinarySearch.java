package dsa_with_java.arrays;

import java.util.*;

//Sorted order of an array is not defined it can be either in ascending order or in descending order 
//Apply binary search in that case

class OrderAgnosticBinarySearch {

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

    public static int binarySearchInOrderAgnostic(int[] arr, int target, boolean isAsc) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Enter the element to be searched for in the array:");
        int data = sc.nextInt();

        int index = (arr[arr.length - 1] > arr[0]) ? binarySearchInOrderAgnostic(arr, data, true)
                : binarySearchInOrderAgnostic(arr, data, false);

        System.out.println("Original Array : ");
        display(arr);

        if (index != -1) {
            System.out.println("Element " + data + " is present in the minimum index of:" + index);
        } else {
            System.out.println("Element " + data + " is not present in the array");
        }
    }

}
