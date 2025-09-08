import java.util.Scanner;

public class PrimeChecker {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getInput("Enter a number: ");
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }

    static int getInput(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
