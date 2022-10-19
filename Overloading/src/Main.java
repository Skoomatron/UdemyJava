public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Trevor", 400);
        int scoreTwo = calculateScore(790);
        calculateScore();
        System.out.println("Final Score Is: " + newScore);
        System.out.println("Final Score Is: " + scoreTwo);

    }
    public static int calculateScore(String name, int score) {
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("No Name Given: " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Name Given: Nothing");
        return 0;
    }
}