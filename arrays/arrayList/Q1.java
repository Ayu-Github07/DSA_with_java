package arrays.arrayList;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to create an array list, add some colors (strings) and print out the collection.

public class Q1 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Violet");
        colors.add("Purple");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Red");

        System.out.println(colors);

    }

}
