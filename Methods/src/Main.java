public class Main {
    public static void main(String[] args) {
        int scoreOne = 50;
        int scoreTwo = 150;
        int scoreThree = 10000;

        calculateScore(scoreOne);
        calculateScore(scoreTwo);
        calculateScore(scoreThree);
    }

    public static void calculateScore(int score) {
        if (score < 100) {
            System.out.println("Try Again " + score);
        } else if (score > 100 && score < 1000) {
            System.out.println("Almost There " + score);
        } else {
            System.out.println("Youre a winner " + score);
        }
    }
}