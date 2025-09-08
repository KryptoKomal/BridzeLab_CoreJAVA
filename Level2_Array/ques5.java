import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter height (in meters) of person " + (i + 1) + ": ");
            height[i] = sc.nextDouble();

            System.out.println("Enter weight (in kg) of person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);
        }

        System.out.println("\n=== BMI Report ===");
        for (int i = 0; i < n; i++) {
            System.out.print("Person " + (i + 1) + " -> Height: " + height[i] + ", Weight: " + weight[i] + ", BMI: " + bmi[i]);

            if (bmi[i] < 18.5) {
                System.out.println(" (Underweight)");
            } else if (bmi[i] < 24.9) {
                System.out.println(" (Normal)");
            } else if (bmi[i] < 29.9) {
                System.out.println(" (Overweight)");
            } else {
                System.out.println(" (Obese)");
            }
        }

        sc.close();
    }
}
