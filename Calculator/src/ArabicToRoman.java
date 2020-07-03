import java.util.HashMap;
import java.util.Map;

public class ArabicToRoman {

    public static String converter (int number) throws Exception {
        StringBuilder string = new StringBuilder();
        int number1 = 0;
        int [] numbers = {40, 50, 90};
        String [] strings = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XL", "L", "XC"};

        if (number == 100) return "C";

        if (number <= 10) return strings[number];

        for (int a = 2; a >= 0; a--) {
            if (number >= numbers[a]) {
                string = new StringBuilder((strings[a + 10]));
                number1 = numbers[a];
                break;
            }
        }

        int temp = (number - number1) / 10;
        for (int b = temp; b > 0; b--) {
            string.append("X");
        }

        if ((number%10) > 0) string.append(strings[number % 10 - 1]);
        return string.toString();

    }
}
