package dsa_with_java.arrays;

import java.util.Scanner;

//Convert the decimal to any number of base b
//Sample I/O:
//57
//2
//Ouput : 111001
class DecimalToAnyBase {

    public static int decimalToAnyBase(int num, int base) {

        int res = 0;
        while (num > 0) {
            int rem = num % base;
            res = res * 10 + rem;
            num /= base;
        }

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

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int base = sc.nextInt();

            int result = decimalToAnyBase(num, base);
            result = reverse(result);

            System.out.println("[" + num + " base 10]" + " = [" + result + " base " + base + "]");

        }

    }
}
