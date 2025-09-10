package thisKeyword;

class Animal {
    void sound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark!");
    }
    
    void fetch() {
        System.out.println("Dog is fetching...");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow!");
    }
}

public class InstanceOfExample {
	    public static void main(String[] args) {
	        Animal animal = new Dog(); 

	        animal.sound(); 

	        if (animal instanceof Dog) {
	            Dog dog = (Dog) animal; 
	            dog.fetch();
	        } else if (animal instanceof Cat) {
	            Cat cat = (Cat) animal;
	            System.out.println("This is a cat.");
	        } else {
	            System.out.println("Unknown animal type.");
	        }
	    }
}
