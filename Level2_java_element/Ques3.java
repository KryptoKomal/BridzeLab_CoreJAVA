package Level2_java_element;

import java.util.Scanner;

public class ques3 {
   public ques3() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter perimeter: ");
      double perimeter = sc.nextDouble();
      double side = perimeter / 4.0;
      System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
   }
}
