package dsa_with_java.arrays;

import java.util.*;

class TransposeOfAMatrix {

    public static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static int[][] transpose(int[][] nums) {

        int row = nums.length;
        int col = nums[0].length;
        int arr[][] = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                arr[i][j] = nums[j][i];
            }
        }
        return arr;

    }

    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3 }, { 5, 6, 7 }, { 7, 8, 9 } };

        System.out.println("Original Matrix is : ");
        display(matrix);

        matrix = transpose(matrix);

        System.out.println("Transponse of a matrix is : ");
        display(matrix);

    }

}
