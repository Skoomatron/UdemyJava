public class Main {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(5, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        boolean isLeap = isLeapYear(year);

        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        }

        if (isLeap) {
            switch (month) {
                case 2:
                    return 29;
                case 9:
                case 4:
                case 6:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        } else {
            switch (month) {
                case 2:
                    return 28;
                case 9:
                case 4:
                case 6:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }
}