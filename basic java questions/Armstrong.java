import java.util.Scanner;

public class Armstrong {

    /*
     * Num = 371
     * Temp = 371, sum = 0
     * inside loop (temp>0):-
     * x = temp%10;
     * sum += Math.pow(x,3);
     * temp /= 10;
     * 
     * if Num==sum otherwise not an Armstrong number.
     */

    public static boolean isArmstrong(int num) {

        int temp = num, sum = 0, size = (int) Math.log10(num) + 1;
        ;

        while (temp > 0) {
            int x = temp % 10;
            sum += Math.pow(x, size);
            temp /= 10;
        }

        // if(num == sum) {
        // return true;
        // }
        // return false;

        return num == sum ? true : false;
    }

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        System.out.println(isArmstrong(number));

        sc.close();

    }
}