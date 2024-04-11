import java.util.Scanner;

public class HalfTheNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        /**
         * a >> b = a/2^b
         * 4 >> 1 = 4/2^1 = 4/2 = 2
         * 8 >> 2 = 8/2^2 = 8/4 = 2
         * 16 >> 3 = 16/2^3 = 16/8 = 2
         */

        System.out.println(a >> 1);
        sc.close();
    }

}
