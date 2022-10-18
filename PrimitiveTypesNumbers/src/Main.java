public class Main {
    public static void main(String[] args) {
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + intMinValue);
        System.out.println("Integer Maximum Value = " + intMaxValue);

        System.out.println("Broken Max = " + (intMaxValue + 1));
        // demonstrates an overflow
            // computes to negative because it cycles around the maximum value to the first min value
            // the opposite is true on min value but referred to as underflow

    }
}