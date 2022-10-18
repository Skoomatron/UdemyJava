public class Main {
    public static void main(String[] args) {

        boolean result = areEqualByThreeDecimalPlaces(3.0, 5.0);
        System.out.println(result);
    }

    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {

        int actualOne = (int)(numOne * 1000);
        int actualTwo = (int)(numTwo * 1000);

        return actualTwo == actualOne;
    }
}