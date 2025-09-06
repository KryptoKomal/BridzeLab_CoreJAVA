package Level2_java_element;

import java.util.Scanner;

public class Ques1 {
   public Ques1() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first number: ");
      double number1 = sc.nextDouble();
      System.out.print("Enter second number: ");
      double number2 = sc.nextDouble();
      double add = number1 + number2;
      double sub = number1 - number2;
      double mul = number1 * number2;
      double div = number1 / number2;
      System.out.println("The addition, subtraction, multiplication and division of " + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
   }
}
