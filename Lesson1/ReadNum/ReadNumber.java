import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (1 - 999): ");
        int num = sc.nextInt();

        if (num < 1 || num > 999) {
            System.out.println("Error! Please enter a number between 1 and 999.");
        } else {
            String result = "";

            // Hàng trăm
            int hundreds = num / 100;
            switch (hundreds) {
                case 1:
                    result += "one hundred";
                    break;
                case 2:
                    result += "two hundred";
                    break;
                case 3:
                    result += "three hundred";
                    break;
                case 4:
                    result += "four hundred";
                    break;
                case 5:
                    result += "five hundred";
                    break;
                case 6:
                    result += "six hundred";
                    break;
                case 7:
                    result += "seven hundred";
                    break;
                case 8:
                    result += "eight hundred";
                    break;
                case 9:
                    result += "nine hundred";
                    break;
                default:
                    break;
            }

            // Hàng chục và đơn vị
            int tensAndOnes = num % 100;
            if (hundreds > 0 && tensAndOnes > 0) {
                result += " and ";
            }

            if (tensAndOnes >= 10 && tensAndOnes < 20) { // Các số từ 10 đến 19
                switch (tensAndOnes) {
                    case 10:
                        result += "ten";
                        break;
                    case 11:
                        result += "eleven";
                        break;
                    case 12:
                        result += "twelve";
                        break;
                    case 13:
                        result += "thirteen";
                        break;
                    case 14:
                        result += "fourteen";
                        break;
                    case 15:
                        result += "fifteen";
                        break;
                    case 16:
                        result += "sixteen";
                        break;
                    case 17:
                        result += "seventeen";
                        break;
                    case 18:
                        result += "eighteen";
                        break;
                    case 19:
                        result += "nineteen";
                        break;
                }
            } else { // Các số từ 20 trở lên
                int tens = tensAndOnes / 10;
                int ones = tensAndOnes % 10;

                switch (tens) {
                    case 2:
                        result += "twenty";
                        break;
                    case 3:
                        result += "thirty";
                        break;
                    case 4:
                        result += "forty";
                        break;
                    case 5:
                        result += "fifty";
                        break;
                    case 6:
                        result += "sixty";
                        break;
                    case 7:
                        result += "seventy";
                        break;
                    case 8:
                        result += "eighty";
                        break;
                    case 9:
                        result += "ninety";
                        break;
                    default:
                        break;
                }

                if (tens > 0 && ones > 0) {
                    result += "-";
                }

                switch (ones) {
                    case 1:
                        result += "one";
                        break;
                    case 2:
                        result += "two";
                        break;
                    case 3:
                        result += "three";
                        break;
                    case 4:
                        result += "four";
                        break;
                    case 5:
                        result += "five";
                        break;
                    case 6:
                        result += "six";
                        break;
                    case 7:
                        result += "seven";
                        break;
                    case 8:
                        result += "eight";
                        break;
                    case 9:
                        result += "nine";
                        break;
                    default:
                        // Không thêm gì nếu không có hàng đơn vị
                        break;
                }
            }

            System.out.println("The number is: " + result);
        }
    }
}
