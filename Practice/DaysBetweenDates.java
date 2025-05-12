package Practice;

public class DaysBetweenDates {

    // Function to calculate the number of days from year 0 to the given date
    public static int countDays(int day, int month, int year) {
        int days = day; // Start with given days

        // Add days for completed years
        for (int i = 0; i < year; i++) {
            days += isLeapYear(i) ? 366 : 365;
        }

        // Add days for completed months in the given year
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Adjust February for leap years
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        for (int i = 0; i < month - 1; i++) {
            days += daysInMonth[i];
        }

        return days;
    }

    // Function to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Function to calculate days between two dates
    public static int daysBetween(int d1, int m1, int y1, int d2, int m2, int y2) {
        return Math.abs(countDays(d1, m1, y1) - countDays(d2, m2, y2));
    }

    public static void main(String[] args) {
        // Example usage
        int d1 = 10, m1 = 3, y1 = 2024;
        int d2 = 25, m2 = 12, y2 = 2023;

        System.out.println("Days between: " + daysBetween(d1, m1, y1, d2, m2, y2));
    }
}
