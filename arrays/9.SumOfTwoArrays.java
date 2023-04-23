package dsa_with_java.arrays;

import java.util.*;

/*
 * You are given 2 numbers in the form of arrays.
 * Now we know what mischief must be cooking in your mind. 
 * No, converting arrays into numbers and adding them is not possible as the length of arrays can be very lengthy.
 * Reader, suppose we are given the following input : 31075 and 111111 , then notice the places of the digits when adding :
 */

class SumOfTwoArrays {

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

    public static int[] sumOfTwoArrays(int[] arr1, int[] arr2) {

        int maxSize = (arr1.length > arr2.length) ? arr1.length + 1 : arr2.length + 1;
        int[] ans = new int[maxSize];

        int i = arr1.length - 1, j = arr2.length - 1, k = ans.length - 1, carry = 0;

        while (i >= 0 || j >= 0) {

            int sum = 0;
            if (i >= 0) {
                sum += arr1[i--];
            }
            if (j >= 0) {
                sum += arr2[j--];
            }
            sum += carry;
            ans[k--] = sum % 10;
            carry = sum / 10;

        }

        ans[k--] = carry;

        return ans;

    }

    public static void main(String[] args) {

        System.out.println("Enter the size of array 1 :");
        int size1 = sc.nextInt();
        int[] arr1 = createArray(size1);

        System.out.println("Enter the size of array 2 :");
        int size2 = sc.nextInt();
        int[] arr2 = createArray(size2);

        System.out.println("Original Array 1: ");
        display(arr1);

        System.out.println("Original Array 2: ");
        display(arr2);

        System.out.println("Sum of two arrays is : \n" + Arrays.toString(sumOfTwoArrays(arr1, arr2)));

    }

}
