public class Main {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }

    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
        }

        int reverse = reverse(num);
        int digits = getDigitCount(num);

        while (digits > 0) {
            switch (reverse % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println(-1);
                    break;
            }
            digits--;
            reverse = reverse / 10;
        }
    }

    public static int reverse(int num) {
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int num) {
        if (num < 0) {return -1;}

        int counter = 0;

        do {
            counter++;
            num = num / 10;
        } while (num > 0);

        return counter;
    }
}