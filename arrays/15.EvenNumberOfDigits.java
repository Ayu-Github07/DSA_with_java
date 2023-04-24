package dsa_with_java.arrays;

import java.util.*;

class EvenNumberOfDigits {

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

    public static boolean isEvenDigits(int num) {

        int count = (int) (Math.log10(num) + 1);

        return (count % 2 == 0) ? true : false;

    }

    public static int countEvenDigitNumbers(int[] arr) {

        int count = 0;

        for (int element : arr) {

            if (element == 0)
                count++;
            else
                count = (isEvenDigits(element)) ? count + 1 : count;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] arr = createArray(size);

        System.out.println(
                "Count of numbers having even number of digits in an array is : " + countEvenDigitNumbers(arr));

    }
}
