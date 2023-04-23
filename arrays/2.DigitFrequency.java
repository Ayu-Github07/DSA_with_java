package dsa_with_java.arrays;

import java.util.Scanner;

//Given a number n, and a digit d, you are required to calculate the frequency of digit d in number n.
class DigitFrequency {

    public static int countFrequency(long num, int digit) {

        int count = 0;
        while (num > 0) {

            if ((num % 10) == digit) {
                count++;
            }
            num /= 10;
        }

        return count;

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            long num = sc.nextLong();
            int digit = sc.nextInt();

            System.out.println(
                    "The frequency of digit " + digit + " in the number " + num + " is: " + countFrequency(num, digit));
        }
    }

}
