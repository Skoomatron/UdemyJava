public class Main {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        if (number >= 5) {

            int row = 1;
            for (int i = number; i != 0; i--) {

                int column = 1;
                while (((row == 1) || (row == number)) && (column <= number)) {
                    System.out.print("*");
                    column++;
                }
                System.out.println("");
                row++;
                column = 1;

                while ((row > 1) && (row < number) && (column <= number)) {
                    if((column == 1) || (column == number) || (column == (number - row + 1)) || (row == column)){
                        System.out.print("*");
                        column++;
                    } else if (column < number) {
                        System.out.print(" ");
                        column++;
                    } else {
                        System.out.println("");
                        row++;
                    }
                }
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}