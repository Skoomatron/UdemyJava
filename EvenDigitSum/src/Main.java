public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-55));
        System.out.println(getEvenDigitSum(20));
        System.out.println(getEvenDigitSum(4));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int current = number;
        int remainder = 0;
        int total = 0;

        while (current >= 10) {

            remainder = current % 10;

            if (remainder % 2 == 0) {
                total += remainder;
            }

            current = (current - remainder) / 10;
        }

        if (current % 2 == 0) {
            total += current;
        }

        return total;
    }
}