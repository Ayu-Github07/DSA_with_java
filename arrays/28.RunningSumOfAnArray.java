package dsa_with_java.arrays;

import java.util.*;

/*
 * https://leetcode.com/problems/running-sum-of-1d-array/description/
 */
class RunningSumOfAnArray {

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

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            ans[i] = sum;
        }

        return ans;
    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        int[] arr = createArray(size);

        int[] ans = runningSum(arr);

        System.out.println("Original Array : ");
        display(arr);

        System.out.println("The running sum array is");
        display(ans);
    }

}
