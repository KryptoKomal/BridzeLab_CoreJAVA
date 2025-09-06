package Level1_control_flow;


import java.util.Scanner;

public class ques11 {
   public ques11() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double total = 0.0;

      while(true) {
         double num = sc.nextDouble();
         if (num <= 0.0) {
            System.out.println("Total is " + total);
            return;
         }

         total += num;
      }
   }
}
