import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanToArabic {

    public static int converter(String string) throws Exception {
        int number = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("II", 2);
        map.put("III", 3);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("VI", 6);
        map.put("VII", 7);
        map.put("VIII", 8);
        map.put("IX", 9);
        map.put("X", 10);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (string.equals(pair.getKey())) {
                number = pair.getValue();
                break;
            }
        }
        if (number == 0) throw new Exception();
        return number;
    }
}
