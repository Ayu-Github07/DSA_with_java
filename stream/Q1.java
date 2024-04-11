// Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}