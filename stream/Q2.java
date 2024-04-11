/*
 * Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */

import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().map(s -> String.valueOf(s)).filter(i -> i.startsWith("1")).forEach(System.out::println);
    }
}
