public class Main {
    public static void main(String[] args) {
        boolean result = shouldWakeUp(true, 12);
        System.out.println(result);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}