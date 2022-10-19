public class Main {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(2, 5));
        System.out.println(calcFeetAndInchesToCentimeters(0, 13));
        System.out.println(calcFeetAndInchesToCentimeters(13));
        System.out.println(calcFeetAndInchesToCentimeters(24));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        double total = 0;

        if (feet >= 0 && inches >= 0 && inches <= 12) {
            total += inches * 2.54;
            total += (feet * 12) * 2.54;
            return total;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        int calculatedFeet = 0;
        int remainder = 0;

        if (inches >= 0) {
            if (inches > 12) {
                remainder = inches % 12;
                calculatedFeet = (inches - remainder) / 12;
                return calculatedFeet;
            } else {
                return inches;
            }
        } else {
            return -1;
        }
    }
}