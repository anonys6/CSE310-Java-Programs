import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "This is my text how is it";

        // Map<Character, Integer> map = new HashMap<>();

        // for (char c : str.toCharArray()) {
        //     map.put(c, map.getOrDefault(c, 0) + 1);
        // }

        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
        // }

        Map<Character, Integer> map = new HashMap<>();

        for (char c: str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}