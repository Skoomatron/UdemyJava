
public class Main {
    public static void main(String[] args) {
        displayPosition("Trevor", 1100);
        displayPosition("Jenny", 1);
        displayPosition("Bobbifer", 732);
        displayPosition("Crungjule", 991);
    }

    public static void displayPosition(String name, int score) {
        int position = calculatePosition(score);
        System.out.println(name + " is now in position " + position + " with a score of " + score);
    }

    public static int calculatePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}