public class Main {
    public static void main(String[] args) {
        int resultOne = 1 + 2;

        System.out.println("One plus two equals " + resultOne);

        int resultTwo = resultOne - 1;

        System.out.println("Result two is equal to " + resultTwo);

        resultOne = resultOne * 10;

        System.out.println("Result one is now equal to " + resultOne);

        resultOne = resultOne / 5;

        System.out.println("Result one is now eequal to " + resultOne);

        resultOne = resultOne % 4;

        System.out.println("The remainder of result one is " + resultOne);

        resultOne++;

        System.out.println("Result is now equal to " + resultOne);

        resultOne--;

        System.out.println("Result is now equal to " + resultOne);

        resultOne += 7;

        System.out.println("Result is now equal to " + resultOne);

        resultOne -= 3;

        System.out.println("Result is now equal to " + resultOne);

        resultOne *= 3;

        System.out.println("Result is now equal to " + resultOne);
    }
}