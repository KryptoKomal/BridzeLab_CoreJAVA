package Level1_java_element;

public class Ques4 {
	   public Ques4() {
	   }

	   public static void main(String[] args) {
	      int costPrice = 129;
	      int sellingPrice = 191;
	      int profit = sellingPrice - costPrice;
	      double profitPercent = (double)profit * 100.0 / (double)costPrice;
	      System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
	   }
	}
