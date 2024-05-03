package learnInheritance;

public class Auto extends Car {
	
	public void noOfWheels() {

		System.out.println("Three Wheeler");
	}
	
	public static void main(String[] args) {
		Auto auto = new Auto();
		auto.applyBreak();
		auto.soundHorn();
		auto.noOfWheels();
	}

}
