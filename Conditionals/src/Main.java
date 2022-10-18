public class Main {
    public static void main(String[] args) {

        boolean boolOne = false;
        int score = 58;

        if (!boolOne) {
            System.out.println("This logic block is evaluated to false.");

        } else {
            System.out.println("This logic block is evaluated to true.");
        }

        if (score > 60) {
            System.out.println("You scored over 50");
        } else if (score == 58) {
            System.out.println("wow");
        } else {
            System.out.println("Big fails");
        }
    }
}