//Count matching characters

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q3 {

    public static void main(String[] args) {
        String str1 = "aaaaaaaaaaaaaabbbbbbbbbbbbbbbbcccccccccccccccccd";
        String str2 = "aaaaaaaabbbbbbccccccdddddddddd";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        HashSet<Character> set = new HashSet<>();

        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char ch : ch1) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ch2) {
            set.add(ch);
        }

        int count = 0;
        for (Map.Entry<Character, Integer> e : map1.entrySet()) {
            if (set.contains(e.getKey())) {
                count++;
            }
        }

        System.out.println(count);

    }
}
