package Level1_control_flow;

import java.util.Scanner;

public class ques8 {
   public ques8() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      for(int counter = sc.nextInt(); counter >= 1; --counter) {
         System.out.println(counter);
      }

   }
}
