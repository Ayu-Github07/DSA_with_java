package dsa_with_java.arrays;

import java.util.*;

class SmallestLetterGreaterThanTarget {

    public static Scanner sc = new Scanner(System.in);

    public static void display(char[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static char[] createArray(int size) {

        char[] arr = new char[size];
        System.out.println("Enter the array of size : " + size);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(1);
        }

        return arr;
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int n = letters.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return letters[low % n];
    }

    public static void main(String[] args) {
        int size = sc.nextInt();
        char[] arr = createArray(size);

        System.out.println("Enter the element to be searched for in the array:");
        char data = sc.next().charAt(1);

        char index = nextGreatestLetter(arr, data);

        System.out.println("Original Array : ");
        display(arr);

        System.out.println("The smallest element greater than or equal to the target is : " + index);
    }

}
