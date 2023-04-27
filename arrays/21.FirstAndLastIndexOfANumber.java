package dsa_with_java.arrays;

import java.util.*;

/*
 * Given an array of integers nums sorted in non-decreasing order, 
 * find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 */

class FirstAndLastIndexOfANumber {

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

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        ans[0] = searchIndex(nums, target, true);
        ans[1] = searchIndex(nums, target, false);

        return ans;
    }

    public static int searchIndex(int[] nums, int target, boolean isFirstIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {

                ans = mid;

                if (isFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }

        return ans;

    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Enter the element to be searched for in the array:");
        int data = sc.nextInt();

        int[] index = searchRange(arr, data);

        System.out.println("Original Array : ");
        display(arr);

        System.out.println(
                "The first and last index of the target value is : \nFirst = " + index[0] + " Last = " + index[1]);
    }

}
