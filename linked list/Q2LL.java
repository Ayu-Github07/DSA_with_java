import java.util.LinkedList;
import java.util.Scanner;

public class Q2LL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers:- ");
        int n = sc.nextInt();

        System.out.println("Enter the data:- ");
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            list.add(temp);
        }

        System.out.println("List before:- ");
        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 25) {
                list.remove(i);
            }
        }

        sc.close();
    }
}
