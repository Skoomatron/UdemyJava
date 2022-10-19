public class Main {
    public static void main(String[] args) {
        char testOne = 'q';

        switch (testOne) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
                System.out.println("The desired letter was found.");
                break;
            default:
                System.out.println("Did not find the letters we are looking for");
                break;
        }
    }
}