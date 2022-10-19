public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        boolean edgeA = isValid(a);
        boolean edgeB = isValid(b);
        boolean edgeC = isValid(c);

        if (!edgeA || !edgeB || !edgeC) {
            return false;
        }

        int digitA = a % 10;
        int digitB = b % 10;
        int digitC = c % 10;

        boolean aCheck = (digitA == digitB) || (digitA == digitC) || (digitB == digitC);
        return aCheck;
    }

    public static boolean isValid(int a) {
        if (a < 10 || a > 1000) {
            return false;
        } else {
            return true;
        }
    }
}