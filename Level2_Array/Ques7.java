import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            while (true) {
                System.out.print("Enter height in meters: ");
                double h = sc.nextDouble();
                if (h > 0) {
                    personData[i][0] = h;
                    break;
                } else {
                    System.out.println("Invalid height! Please enter a positive value.");
                }
            }

            while (true) {
                System.out.print("Enter weight in kg: ");
                double w = sc.nextDouble();
                if (w > 0) {
                    personData[i][1] = w;
                    break;
                } else {
                    System.out.println("Invalid weight! Please enter a positive value.");
                }
            }

            double bmi = personData[i][1] / (personData[i][0] * personData[i][0]);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n=== BMI Report ===");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                    " -> Height: " + personData[i][0] +
                    " m, Weight: " + personData[i][1] +
                    " kg, BMI: " + personData[i][2] +
                    " (" + weightStatus[i] + ")");
        }

        sc.close();
    }
}
