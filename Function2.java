import java.util.*;

public class Function2 {
    // function
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        // input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // function call
        int sum = calculateSum(a, b);
        System.out.println(" Sum of 2 number is:" + sum);

    }

}
