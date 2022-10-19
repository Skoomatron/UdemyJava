public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int num) {
        if (num < 0) {
            return false;
        }

        boolean checker = (num % 2 == 1) ? true : false;
        return checker;
    }

    public static int sumOdd(int start, int end) {
        int total = 0;

        if (start <= 0 || end <= 0 || start > end) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                total += i;
            }
        }

        return total;
    }
}