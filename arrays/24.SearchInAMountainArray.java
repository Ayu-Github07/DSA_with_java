package dsa_with_java.arrays;

import java.util.*;

class SearchInAMountainArray {

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

    public static int findInMountainArray(int target, int[] mountainArr) {

        int peakElementIndex = searchThePeakElementIndex(mountainArr);
        int leftAns = binarySearchInMountainArray(mountainArr, 0, peakElementIndex, target, true);

        if (leftAns != -1) {
            return leftAns;
        }

        int rightAns = binarySearchInMountainArray(mountainArr, peakElementIndex, mountainArr.length - 1, target,
                false);

        return rightAns;

    }

    public static int binarySearchInMountainArray(int[] mountainArr, int start, int end, int target, boolean isAsc) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mountainArr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (mountainArr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (mountainArr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;

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

        System.out.println("Enter the element to be searched for in the array:");
        int data = sc.nextInt();

        int index = findInMountainArray(data, arr);

        System.out.println("Original Array : ");
        display(arr);

        if (index != -1) {
            System.out.println("Element " + data + " is present in the minimum index of:" + index);
        } else {
            System.out.println("Element " + data + " is not present in the array");
        }
    }

}
