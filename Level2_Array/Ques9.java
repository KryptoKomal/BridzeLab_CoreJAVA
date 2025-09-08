import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks of Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                while (true) {
                    System.out.print("Enter marks (0-100): ");
                    double m = sc.nextDouble();
                    if (m >= 0 && m <= 100) {
                        marks[i][j] = m;
                        break;
                    } else {
                        System.out.println("Invalid marks! Enter again.");
                    }
                }
            }
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        System.out.println("\n=== Result Sheet ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " -> Physics: " + marks[i][0] +
                    ", Chemistry: " + marks[i][1] +
                    ", Maths: " + marks[i][2] +
                    ", Percentage: " + percentage[i] +
                    "%, Grade: " + grade[i]);
        }

        sc.close();
    }
}
