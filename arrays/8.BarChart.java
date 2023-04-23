package dsa_with_java.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Let us guide you to the problem. You are given an array of n elements. 
 * Each element depicts the height of a vertical bar.
 * 
 * Input : [3,1,0,7,5]
 * Output :
 *       
 *       *
 *       * 
 *       * *
 *       * *
 *  *    * *
 *  *    * *
 *  * *  * *
 */
class BarChart {

    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int size = sc.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Original Array : ");
            display(arr);

        }

    }

}
