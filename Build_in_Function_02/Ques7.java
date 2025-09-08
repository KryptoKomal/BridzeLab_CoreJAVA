import java.util.Scanner;

public class GCDLCMCalculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int gcd = calculateGCD(a, b);
        int lcm = calculateLCM(a, b, gcd);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    static int getInput(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    static int calculateGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    static int calculateLCM(int x, int y, int gcd) {
        return (x * y) / gcd;
    }
}
