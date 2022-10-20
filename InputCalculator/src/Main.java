import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        int average = 0;

        if (scanner.hasNextInt()) {
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            }
            average = Math.round(Math.round(sum)/counter);
            System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        } else {
            System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        }
    }
}