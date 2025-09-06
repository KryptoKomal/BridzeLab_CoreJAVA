package Level1_java_element;

public class Ques7 {
	   public Ques7() {
	   }

	   public static void main(String[] args) {
	      double radiusKm = 6378.0;
	      double pi = Math.PI;
	      double volumeKm = 1.3333333333333333 * pi * Math.pow(radiusKm, 3.0);
	      double radiusMiles = radiusKm / 1.6;
	      double volumeMiles = 1.3333333333333333 * pi * Math.pow(radiusMiles, 3.0);
	      System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
	   }
	}
