public class Main {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        long years = (minutes - (minutes % 525600)) / 525600;
        long leftover = minutes - (years * 525600);
        long days = (leftover - (leftover % 1440)) / 1440;

        if (minutes >= 0) {
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        } else {
            System.out.println("Invalid Input");
        }
    }
}