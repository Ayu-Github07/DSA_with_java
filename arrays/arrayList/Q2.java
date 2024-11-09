package arrays.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 2. Write a Java program to iterate through all elements in an array list.

public class Q2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        list.stream().forEach(System.out::println);
    }

}
