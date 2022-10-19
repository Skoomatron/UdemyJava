public class Main {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-6));

    }

    public static boolean isPerfectNumber(int num) {
        if (num < 1) {return false;}

        int total = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                total += i;
                System.out.println(total);
            }
        }
        boolean check = total == num ? true : false;
        return check;
    }
}