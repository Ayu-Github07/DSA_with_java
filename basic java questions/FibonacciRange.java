import java.util.Scanner;

public class FibonacciRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = 0, y = 1, z = 0;
        for (int i = 0; i <= b; i++) {

            if (i == 0 || i == 1) {
                if (a <= i && b >= i) {
                    System.out.print(i + " ");
                }
            } else if (i >= 2) {
                z = x + y;
                x = y;
                y = z;

                if (a <= z && b >= z) {
                    System.out.print(z + " ");
                }
            }

        }

        sc.close();
    }
}