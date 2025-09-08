import java.util.Scanner;

public class FactorialRecursion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = getInput("Enter a number: ");
        long fact = factorial(n);
        System.out.println("Factorial of " + n + " is " + fact);
    }

    static int getInput(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
