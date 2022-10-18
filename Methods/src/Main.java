public class Main {
    public static void main(String[] args) {
        int scoreOne = 50;
        int scoreTwo = 150;
        int scoreThree = 10000;
        String result;

        result = calculateScore(scoreOne);
        System.out.println(result);
        result = calculateScore(scoreTwo);
        System.out.println(result);
        result = calculateScore(scoreThree);
        System.out.println(result);


    }

    public static String calculateScore(int score) {
        if (score < 100) {
            return "Try Again";
        } else if (score > 100 && score < 1000) {
            return "Almost There";
        } else {
            return "You're a winner!";
        }
    }
}