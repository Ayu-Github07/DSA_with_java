package dsa_with_java.arrays;

import java.util.*;

/*
 * You are given a sorted array "a" of n elements. Given a number d, 
 * you have to find it's occurrence in the array as well as its last occurrence. 
 * The array may contain duplicates.
 */
class FirstAndLastIndex {

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

    public static int[] firstAndLastIndex(int[] arr, int val) {

        int[] ans = new int[2];

        int currIndex = 0;
        boolean firstEncounter = false;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == val && !firstEncounter) {
                ans[0] = i;
                currIndex = i;
                firstEncounter = true;
            } else if (arr[i] == val) {
                currIndex = i;
            }

        }

        ans[1] = currIndex;

        return ans;

    }

    public static void main(String[] args) {

        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println("Enter the element to find the index of : ");
        int val = sc.nextInt();

        System.out.println("Original Array: ");
        display(arr);

        int[] ans = firstAndLastIndex(arr, val);

        System.out
                .println("The first index is : " + ans[0] + " the last index is : " + ans[1] + " of the element: "
                        + val);
    }

}
