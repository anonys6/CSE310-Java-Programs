import java.util.Map;
import java.util.HashMap;
// import java.util.Collections;
// import java.util.Arrays;

public class Fre {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 1, 3, 2, 4, 3, 2 };

        Map<Integer, Integer> fre = new HashMap<>();

        for (int val: arr) {
            if (fre.containsKey(val)) {
                fre.put(val, fre.get(val) + 1);
            } else {
                fre.put(val, 1);
            }
        }


        for (Map.Entry<Integer, Integer> entry: fre.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        

        System.out.println(fre);

        String str = "Hello";
        StringBuilder tool = new StringBuilder(str);

        tool.reverse();

        System.out.println(tool.toString());

    }
}
