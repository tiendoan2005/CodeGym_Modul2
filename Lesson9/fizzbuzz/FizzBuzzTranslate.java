class FizzBuzzTranslate {
    public static String translate(int n) {
        if (n <= 0 || n >= 100) {
            return null;
        }
        boolean divisibleBy3 = (n % 3 == 0);
        boolean divisibleBy5 = (n % 5 == 0);
        boolean contains3 = String.valueOf(n).contains("3");
        boolean contains5 = String.valueOf(n).contains("5");

        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz";
        }
        if (divisibleBy3 || contains3) {
            return "Fizz";
        }
        if (divisibleBy5 || contains5) {
            return "Buzz";
        }
        return numberToWords(n);
    }

    private static String numberToWords(int n) {
        String[] words = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin"};
        if (n < 10) {
            return words[n];
        }
        return words[n / 10] + " " + words[n % 10];
    }
}