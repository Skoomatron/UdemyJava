import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        System.out.println("Please enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i + 1));
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                total += scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("You did not enter a number!");
                scanner.nextLine();
            }
        }

        scanner.close();

        System.out.println("The total of the numbers you entered is: " + total);
    }
}