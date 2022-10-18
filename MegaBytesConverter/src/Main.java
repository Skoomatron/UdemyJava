public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int remainder = kiloBytes % 1024;
        int difference = kiloBytes - remainder;
        int megaBytes = difference / 1000;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}