public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(1223));
    }

    public static int sumDigits(int num) {

        if (num < 10) {
            return -1;
        }

        int total = 0;
        int current = num;
        int remainder = 0;

        do {
            // 122 12
            remainder = current % 10; // 2 2
            total += remainder; // 2 4
            current = (current - remainder) / 10; // 12 1
            System.out.println(total);
        } while (current > 10);

        total += current;
        return total;
    }
}