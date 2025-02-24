public class TelephoneNumberValidate {
    private static final String TELEPHONENUMBER_PATTERN = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static boolean isValid(String telephoneNumber) {
        return telephoneNumber.matches(TELEPHONENUMBER_PATTERN);
    }

    public static void main(String[] args) {
        String[] telephoneNumbers = {"(84)-(0978489648)",
                "(84)-(0971234567)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)",
                "(123)-(0123456789)"};
        for (String check : telephoneNumbers) {
            System.out.println(check + ": " + (isValid(check) ? "Hợp lệ" : "Không hợp lệ"));
        }
    }
}
