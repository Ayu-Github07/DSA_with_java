package dsa_with_java.arrays;

import java.util.*;

class CeilingOfANumber {

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

    public static int binarySearch(int[] arr, int target) {

        // {2,3,5,9,14,16,18}
        // target = 15

        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {

            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return arr[start];

    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Enter the element to be searched for in the array:");
        int data = sc.nextInt();

        int index = binarySearch(arr, data);

        System.out.println("Original Array : ");
        display(arr);

        System.out.println("The smallest element greater than or equal to the target is : " + index);
    }

}
