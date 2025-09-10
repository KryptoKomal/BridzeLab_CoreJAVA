//Ques Use static for shared values and utility methods to reduce memory usage and avoid redundancy. 
package thisKeyword;

class MathUtils {

    public static final double PI = 3.14159;

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }

}
public class UsestaticVariable {
	public static void main(String[] args) {
		    double radius = 5.0;
	        double circleArea = MathUtils.calculateCircleArea(radius);

	        System.out.println("Area of Circle: " + circleArea);  
	}

}
