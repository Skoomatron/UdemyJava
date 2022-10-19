public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(122, 3));
        System.out.println(getDurationString(3736));
    }

    public static String getDurationString(int minutes, int seconds) {

        int actualHours = 0;
        int actualMinutes = 0;

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            actualMinutes = minutes % 60;
            actualHours = (minutes - actualMinutes) / 60;
            return actualHours + " hours " + actualMinutes + " minutes " + seconds + " seconds.";
        } else {
            return "Invalid Values";
        }
    }

    public static String getDurationString(int seconds) {

        int minutes = 0;
        int remainder = 0;

        if (seconds >= 0) {
            remainder = seconds % 60;
            minutes = (seconds - remainder) / 60;
            return getDurationString(minutes, remainder);
        } else {
            return "Invalid Values";
        }
    }
}