package dsa_with_java.arrays;

import java.util.Scanner;

//Write a java program to calculate the Npr 
//Npr = (N)!/(N-r)!;

class CalculateNPR {

    public static int factorial(int n) {

        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    public static void display(int n, int r, int npr) {

        System.out.println(n + "P" + r + " = " + npr);

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n, r;

            n = sc.nextInt();
            r = sc.nextInt();

            int nfact = factorial(n);
            int nmrfact = factorial(n - r);

            int npr = nfact / nmrfact;
            display(n, r, npr);
        }

    }

}
