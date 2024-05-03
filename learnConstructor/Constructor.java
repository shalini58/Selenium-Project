package learnConstructor;

public class Constructor {
	
	public Constructor() {
		System.out.println("test");
		
	}
	public Constructor(String name) {
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		Constructor dcons = new Constructor();
		Constructor pcons = new Constructor("Shalini");
	}

}
