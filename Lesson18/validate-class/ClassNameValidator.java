import java.util.regex.Pattern;

public class ClassNameValidator {
    private static final String CLASS_NAME_PATTERN = "^[CAP]\\d{4}[G-HIK]$";

    public static boolean isValidClassName(String className) {

        return Pattern.matches(CLASS_NAME_PATTERN, className);
    }

    public static void main(String[] args) {
        String[] testCases = {"C1234G", "A5678H", "P0000I", "B1234K", "C12A4G", "C12345G", "P1234Z"};

        for (String className : testCases) {
            System.out.println(className + ": " + (isValidClassName(className) ? "Hợp lệ" : "Không hợp lệ"));
        }
    }
}
