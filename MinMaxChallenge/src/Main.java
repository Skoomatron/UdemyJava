import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

        do {
            System.out.println("Enter A Number: ");
            boolean check = scanner.hasNextInt();
            if (check) {
                int current = scanner.nextInt();
                scanner.nextLine();
                if (current > max) {
                    max = current;
                }
                if (current < min) {
                    min = current;
                }
            } else {
                System.out.println("Invalid Entry!");
                break;
            }

            System.out.println("Current minimum number is: " + min);
            System.out.println("Current maximum number is: " + max);
        } while (true);
        scanner.close();
    }
}