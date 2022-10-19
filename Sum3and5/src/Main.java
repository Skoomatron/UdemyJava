public class Main {
    public static void main(String[] args) {
        int total = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            if (counter == 5) {
                System.out.println("Total of numbers is " + total);
                break;
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                total += i;
                counter++;
                System.out.println("This number works " + i);
            }
        }
    }


}