import java.util.Scanner;

public class FibonacciGenerator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int terms = getInput("Enter number of terms: ");
        printFibonacci(terms);
    }

    static int getInput(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
