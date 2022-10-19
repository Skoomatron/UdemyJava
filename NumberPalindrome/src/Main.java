public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(606));

    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int current = number;

        while (current > 0) {
            int last = current % 10;
            reverse = (reverse * 10) + last;
            current = current / 10;
        }
        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}