import java.util.Scanner;

public class BasicCalculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();
        double result = 0;

        switch (choice) {
            case 1: result = add(num1, num2); break;
            case 2: result = subtract(num1, num2); break;
            case 3: result = multiply(num1, num2); break;
            case 4: result = divide(num1, num2); break;
            default: System.out.println("Invalid choice"); return;
        }

        System.out.println("Result: " + result);
    }

    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return b != 0 ? a / b : 0; }
}
