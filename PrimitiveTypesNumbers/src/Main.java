public class Main {
    public static void main(String[] args) {

        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;

        System.out.println("Byte Min = " + byteMin);
        System.out.println("Byte Max = " + byteMax);

        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;

        System.out.println("Short min = " + shortMin);
        System.out.println("Short max = " + shortMax);

        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + intMinValue);
        System.out.println("Integer Maximum Value = " + intMaxValue);

        System.out.println("Broken Max = " + (intMaxValue + 1));
        // demonstrates an overflow
            // computes to negative because it cycles around the maximum value to the first min value
            // the opposite is true on min value but referred to as underflow

        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;

        System.out.println("Long min = " + longMin);
        System.out.println("Long max = " + longMax);
    }
}