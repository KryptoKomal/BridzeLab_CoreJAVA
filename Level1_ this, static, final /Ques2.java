//Ques -Leverage this to avoid ambiguity when initializing attributes.
package thisKeyword;

class Car {
    public static String manufacturer = "AutoTech";

    public String model;
    public int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }
}


public class Ques2 {
	 public static void main(String[] args) {

	        Car car1 = new Car("X1", 2020);
	        Car car2 = new Car("Z3", 2023);

	        car1.displayInfo();
	        car2.displayInfo();
	 }
}
