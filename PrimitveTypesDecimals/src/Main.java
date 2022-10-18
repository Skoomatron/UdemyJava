public class Main {
    public static void main(String[] args) {
        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        System.out.println("Float min = " + floatMin);
        System.out.println("Float max = " + floatMax);

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("Double min = " + doubleMin);
        System.out.println("Double max = " + doubleMax);

        float floatOne = (float) 5.5 / (float) 3; // casted because double is the default decimal type
        float floatTwo = 5.5f / 3f; // typed f due to double being default type for decimal
        double doubleOne = 5.5d / 3d;
        int intOne = 5 / 3; // Will only calculate whole value, remainder is left off.

        System.out.println("Float one = " + floatOne);
        System.out.println("Float two = " + floatTwo);
        System.out.println("Double one = " + doubleOne);
        System.out.println("Integer one = " + intOne);

    }
}