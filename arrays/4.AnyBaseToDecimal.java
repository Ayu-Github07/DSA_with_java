package dsa_with_java.arrays;

import java.util.Scanner;

//Convert number with given base to decimal
class AnyBaseToDecimal {

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
            int base = sc.nextInt();

            int result = anyBaseToDecimal(num, base);
            System.out.println("[" + num + " base " + base + "]" + " = [" + result + " base 10]");

        }

    }

}
