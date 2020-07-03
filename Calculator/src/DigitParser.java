import java.util.Scanner;

public class DigitParser {

    public static int [] parse(String string) throws Exception {

        String string2 = OperatorSpaces.spaces((string));
        Scanner scanner = new Scanner(string2);
        int [] digits = new int[2];
        digits[0] = scanner.nextInt();
        scanner.next();
        digits[1] = scanner.nextInt();
        if ((digits[0] > 10) | (digits[1] > 10)) throw new Exception();
        else return digits;
    }
}
