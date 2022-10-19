public class Main {
    public static void main(String[] args) {
        int count = 0;
        do {
            boolean test = isEvenNumber(count);
            System.out.println(test);
            count++;
        } while(count < 10);
    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}