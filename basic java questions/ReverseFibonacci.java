import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseFibonacci {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        int x = 0, y = 1, z = 0;
        for (int i = 0; i <= b; i++) {

            if (i == 0 || i == 1) {
                arrayList.add(i);
            } else if (i >= 2) {
                z = x + y;
                x = y;
                y = z;
                arrayList.add(z);
            }

        }

        Collections.reverse(arrayList);

        arrayList.stream().forEach(System.out::print);

        sc.close();

    }

}
