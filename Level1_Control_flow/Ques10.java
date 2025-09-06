package Level1_control_flow;

import java.util.Scanner;

public class ques10 {
   public ques10() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double total;
      double num;
      for(total = 0.0; (num = sc.nextDouble()) != 0.0; total += num) {
      }

      System.out.println("Total is " + total);
   }
}
