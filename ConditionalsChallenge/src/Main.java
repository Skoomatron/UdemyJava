public class Main {
    public static void main(String[] args) {
        double doubleOne = 20.00;
        double doubleTwo = 80.00;

        double result = (doubleTwo + doubleOne) * 100;

        double remainder = result % 40.00;

        boolean check = (remainder == 0) ? true : false;

        System.out.println("Check is equal to " + check);

        if (!check) {
            System.out.println("There was some junk left.");
        }
    }
}