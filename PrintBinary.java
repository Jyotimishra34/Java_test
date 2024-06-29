import java.util.*;

public class PrintBinary {

    public static void printBinary(int n) {
        for (int i = 31; i >= 0; i--) {
            int mask = 1 << i; // create a bit mask for the current bit position
            if ((n & mask) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }

    public static void main(String[] args) {
        int num = 8; // test number
        System.out.print("Binary representation of " + num + ": ");
        printBinary(num);
        System.out.println();
    }
}
