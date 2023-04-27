package dsa_with_java.arrays;

/*
 * Suppose you have a sorted array of infinite numbers, how would you search an element in the array?
 * Source: Amazon Interview Experience. 
 * Since array is sorted, the first thing clicks into mind is binary search, but the problem here is that we don’t know size of array. 
 * If the array is infinite, that means we don’t have proper bounds to apply binary search. So in order to find position of key, first we find bounds and then apply binary search algorithm.
 * Let low be pointing to 1st element and high pointing to 2nd element of array, Now compare key with high index element, 
 * ->if it is greater than high index element then copy high index in low index and double the high index. 
 * ->if it is smaller, then apply binary search on high and low indices found. 
 */
import java.util.*;

class FindElementInInfiniteSortedArray {

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

    public static int searchTheIndex(int[] nums, int target) {

        int start = 0;
        int end = 1;

        while (nums[end] < target) {

            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return searchTheStartAndLastIndex(nums, target, start, end);
    }

    public static int searchTheStartAndLastIndex(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {

                return mid;

            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Enter the element to be searched for in the array:");
        int data = sc.nextInt();

        int index = searchTheIndex(arr, data);

        System.out.println("Original Array : ");
        display(arr);

        if (index != -1) {
            System.out.println("Element " + data + " is present at the index :" + index);
        } else {
            System.out.println("Element " + data + " is not present in the array");
        }
    }

}
