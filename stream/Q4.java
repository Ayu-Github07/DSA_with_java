import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(1, 1, 3, 4, 5);
        int k = 5;

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int result = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getKey() == k)
                result++;
            else if (map.get(k - entry.getKey()) != null && map.get(k - entry.getKey()) != -1) {
                result++;
                entry.setValue(-1);
            }
        }

        System.out.println(result);
    }
}
