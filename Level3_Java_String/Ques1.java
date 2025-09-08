import java.util.*;

class BMIProgram {
    public static String bmiStatus(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(heightCm);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = bmiStatus(bmi);
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
        }
        String[][] result = computeBMI(personData);
        display(result);
    }
}
