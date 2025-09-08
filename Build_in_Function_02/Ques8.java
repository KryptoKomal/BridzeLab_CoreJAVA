import java.util.Scanner;

public class TemperatureConverter {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius");
        int choice = sc.nextInt();
        if (choice == 1) {
            double c = getInput("Enter temperature in Celsius: ");
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(c));
        } else if (choice == 2) {
            double f = getInput("Enter temperature in Fahrenheit: ");
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(f));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    static double getInput(String msg) {
        System.out.print(msg);
        return sc.nextDouble();
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
