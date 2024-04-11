import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a = 3, b = 4
        a = a ^ b; // 3 ^ 4 = 7, a = 7
        b = a ^ b; // 7 ^ 4 = 3, b = 3
        a = a ^ b; // 7 ^ 3 = 4, a = 4

        System.out.println(a + " " + b);

        sc.close();

    }

}
