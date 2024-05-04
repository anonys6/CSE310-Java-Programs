import java.util.Map;
import java.util.HashMap;

public class ArrFrequency {
    public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 4, 2, 4 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.err.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
