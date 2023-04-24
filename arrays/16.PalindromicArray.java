package dsa_with_java.arrays;

import java.util.*;
/*
 * Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. 
 * Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
 */

class PalindromicArray {

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

    public static int reverse(int n) {

        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }

        return res;

    }

    public static boolean isPalindrome(int num) {

        int rev = reverse(num);

        return (num == rev) ? true : false;

    }

    public static int isPalinArrayOrNot(int[] num) {

        int flag = 1;

        for (int element : num) {
            if (!isPalindrome(element)) {
                flag = 0;
                return flag;
            }
        }

        return flag;

    }

    public static void main(String[] args) {

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Original Array: ");
        display(arr);

        if (isPalinArrayOrNot(arr) == 1) {
            System.out.println("The given array is palinArray");
        } else {
            System.out.println("The given array is not a palinArray");
        }
    }
}
