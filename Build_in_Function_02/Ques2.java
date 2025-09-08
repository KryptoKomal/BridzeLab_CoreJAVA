import java.util.Scanner;

public class MaxOfThree {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = getInput("Enter first number: ");
        int b = getInput("Enter second number: ");
        int c = getInput("Enter third number: ");
        int max = findMax(a, b, c);
        System.out.println("Maximum number is: " + max);
    }

    static int getInput(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }

    static int findMax(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
}
