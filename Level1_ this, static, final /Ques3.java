//Ques3 - Declare final variables for identifiers or constants that should remain unchanged.
package thisKeyword;

public class FinalVariableExample {
    final double PI = 3.14159;
    final int MAX_USERS = 100;

    public void printConstants() {
        System.out.println("Value of PI: " + PI);
        System.out.println("Maximum users allowed: " + MAX_USERS);
    }

public class Ques3 {
	    public static void main(String[] args) {
	        FinalVariableExample example = new FinalVariableExample();
	        example.printConstants();
	    }
	}


}
