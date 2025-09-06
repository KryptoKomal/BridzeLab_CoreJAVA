package Level1_java_element;
import java.util.Scanner;

public class Ques10 {
   public Ques10() {
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your height in cm: ");
      double cm = input.nextDouble();
      double inches = cm / 2.54;
      int feet = (int)(inches / 12.0);
      double remainingInches = inches % 12.0;
      System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remainingInches);
   }
}

