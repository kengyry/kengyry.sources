
public class OperatorSpaces {
    public static String spaces(String string) {
        if (string.contains("+")) {
            return string.replace("+", " + ");
        }
        if (string.contains("-")) {
            return string.replace("-", " - ");
        }
        if (string.contains("*")) {
            return string.replace("*", " * ");
        }
        return string.replace("/", " / ");
    }
}

