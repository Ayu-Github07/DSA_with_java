import java.util.Scanner;

public class NewNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int n = str.length();

        if (n <= 1) {
            char ch = str.charAt(0);
            System.out.println(ch - 'a' + 1);
        } else {
            char[] chArray = str.toCharArray();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans += (chArray[i] - 'a' + 1) * (int) Math.pow(20, i);
            }
            System.out.println(ans);
        }

        sc.close();
    }
}
