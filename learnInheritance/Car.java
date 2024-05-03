package learnInheritance;

public class Car extends Vehicle {
	
	public void noOfWheels() {

		System.out.println("Four Wheeler");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.applyBreak();
		car.soundHorn();
		car.noOfWheels();
	}

}
