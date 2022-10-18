public class Main {
    public static void main(String[] args) {
        String stringOne = "testing";

        System.out.println("String one = " + stringOne);
        stringOne = stringOne + ", wow. \u00A9";
        System.out.println("String one = " + stringOne);

        String numString = "250.23";
        numString = numString + "45";

        System.out.println("Num string = " + numString);

        int intOne = 5;

        numString = numString + intOne;

        System.out.println("Did we add a number? " + numString);
    }
}