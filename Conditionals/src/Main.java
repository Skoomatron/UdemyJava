public class Main {
    public static void main(String[] args) {
        boolean boolOne = false;
        if (boolOne == false) {
            System.out.println("This logic block is evaluated to false.");
            boolOne = true;
        } else {
            System.out.println("This logic block is evaluated to true.");
        }

        if (boolOne == true) {
            System.out.println("Here I am chaining conditionals while this video puts me to sleep.");
        }
    }
}