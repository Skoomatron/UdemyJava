public class Main {
    public static void main(String[] args) {
        byte byteOne = 5;
        short shortOne = 8;
        int intOne = 89;

        long longTotal = (10 * (byteOne + shortOne + intOne)) + 50000;

        System.out.println("Long total is equal to :" + longTotal);
    }
}