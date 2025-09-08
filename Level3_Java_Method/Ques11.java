import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[][] employees = generateSalaryAndService(10);
        double[][] updatedEmployees = calculateBonus(employees);
        displayTotals(employees, updatedEmployees);
    }

    static double[][] generateSalaryAndService(int n) {
        double[][] arr = new double[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 10000 + Math.random() * 90000;
            arr[i][1] = 1 + Math.random() * 10;
        }
        return arr;
    }

    static double[][] calculateBonus(double[][] arr) {
        double[][] updated = new double[arr.length][3];
        for (int i = 0; i < arr.length; i++) {
            double salary = arr[i][0];
            double years = arr[i][1];
            double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
            updated[i][0] = salary;
            updated[i][1] = bonus;
            updated[i][2] = salary + bonus;
        }
        return updated;
    }

    static void displayTotals(double[][] oldArr, double[][] newArr) {
        double oldSum = 0, newSum = 0, bonusSum = 0;
        System.out.printf("%-10s %-10s %-10s %-10s%n", "OldSalary", "Bonus", "NewSalary", "Years");
        for (int i = 0; i < oldArr.length; i++) {
            oldSum += oldArr[i][0];
            bonusSum += newArr[i][1];
            newSum += newArr[i][2];
            System.out.printf("%-10.2f %-10.2f %-10.2f %-10.0f%n", oldArr[i][0], newArr[i][1], newArr[i][2], oldArr[i][1]);
        }
        System.out.printf("Total: %-10.2f %-10.2f %-10.2f%n", oldSum, bonusSum, newSum);
    }
}
