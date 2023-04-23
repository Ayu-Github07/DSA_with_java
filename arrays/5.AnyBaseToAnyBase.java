package dsa_with_java.arrays;

import java.util.Scanner;

//Convert a number with a given base to number with another base.

class AnyBaseToAnyBase {

    public static int decimalToAnyBase(int num, int base) {

        int res = 0;
        while (num > 0) {
            int rem = num % base;
            res = res * 10 + rem;
            num /= base;
        }

        res = reverse(res);
        return res;
    }

    public static int reverse(int n) {

        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }

        return res;

    }

    public static int anyBaseToDecimal(int num, int base) {

        int result = 0, i = 0;

        while (num > 0) {
            result += (num % 10) * (int) Math.pow(base, i);
            num /= 10;
            i++;
        }

        return result;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int num = sc.nextInt();
            int base1 = sc.nextInt();
            int base2 = sc.nextInt();

            int convertNumtoDecimal = anyBaseToDecimal(num, base1);
            int result = decimalToAnyBase(convertNumtoDecimal, base2);

            System.out.println("[" + num + " base " + base1 + "]" + " = [" + result + " base " + base2 + "]");

        }

    }
}
