import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calc {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) throws Exception {
        if (b == 0) throw new Exception();
        else return (double) a / b;
    }

    public int roundDivision(int a, int b) throws Exception {
        if (b == 0) throw new Exception();
        else return a / b;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calc calc = new Calc();

        int[] digits;
        String line2;
        while (true) {
            String line = reader.readLine();
            line2 = line.replace(" ", "");
            if (line2.matches("\\d{1,2}[\\x2a\\x2b\\x2d\\x2f]\\d{1,2}")) {
                digits = DigitParser.parse(line2);
                if (line.contains("+")) System.out.println(calc.addition(digits[0], digits[1]));
                if (line.contains("-")) System.out.println(calc.subtraction(digits[0], digits[1]));
                if (line.contains("*")) System.out.println(calc.multiplication(digits[0], digits[1]));
                if (line.contains("/")) System.out.println(calc.division(digits[0], digits[1]));
            }
            else if (line2.toUpperCase().matches("\\p{Upper}{1,4}[\\x2a\\x2b\\x2d\\x2f]\\p{Upper}{1,4}")) {
                digits = RomanParser.parse(line2);
                if (line.contains("+"))
                    System.out.println(ArabicToRoman.converter(calc.addition(digits[0], digits[1])));
                if (line.contains("-"))
                    System.out.println(ArabicToRoman.converter(calc.subtraction(digits[0], digits[1])));
                if (line.contains("*"))
                    System.out.println(ArabicToRoman.converter(calc.multiplication(digits[0], digits[1])));
                if (line.contains("/"))
                    System.out.println(ArabicToRoman.converter(calc.roundDivision(digits[0], digits[1])));
            } else throw new Exception();
        }
    }
}
