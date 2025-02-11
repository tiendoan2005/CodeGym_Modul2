// NextDayCalculator.java
public class NextDayCalculator {
    public static int[] getNextDay(int day, int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        if (day < daysInMonth[month - 1]) {
            return new int[]{day + 1, month, year};
        } else if (month < 12) {
            return new int[]{1, month + 1, year};
        } else {
            return new int[]{1, 1, year + 1};
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
