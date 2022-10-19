public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            double total = calculateInterest(10000, i);
            System.out.println("Monies are " + total);
        }

        for (int i = 8; i >= 2; i--) {
            double total = calculateInterest(10000, i);
            System.out.println("Monies are " + total);
        }
    }

    public static double calculateInterest(double amount, double rate) {
        return (amount * (rate / 100));
    }
}