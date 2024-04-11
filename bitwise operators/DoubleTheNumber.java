import java.util.Scanner;

public class DoubleTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        /**
         * a << b = a * 2^b
         * a << 1 = a * 2^1 = a * 2 = 2a
         * a << 2 = a * 2^2 = a * 4 = 4a
         * a << 3 = a * 2^3 = a * 8 = 8a
         * 
         * For example:-
         * a = 5
         * 1 0 1
         * 
         * a < < 2 => 1 0 1 0 0
         * => 16 + 4 = 20
         * => 4 * 5
         * 
         * a < < 3 => 1 0 1 0 0 0
         * => 32 + 8 = 40
         */

        System.out.println(a << 1);

        sc.close();

    }

}
