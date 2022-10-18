public class Main {
    public static void main(String[] args) {
        int intOne = (Integer.MIN_VALUE / 2);

        // byte byteOne = (intOne / 2);
        // Throw an error because it is not "cast" to the specific type
        byte byteOne = (byte)(intOne / 2);


        // short shortOne = (intOne / 2);
        // Throw an error because it is not "cast" to the specific type
        short shortOne = (short)(intOne / 2);

    }
}