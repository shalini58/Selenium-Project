package learnAbstraction;

public class ICICI implements RBI {

	public void minBlance() {

		System.out.println("500");
	}

	public void maxLoanAmount() {
 
		 System.out.println("500000");
	}
	
	public void maxHomeLoan() {
		System.out.println("1000000");
	}
	
	public static void main(String[] args) {
		RBI icici = new ICICI();
		icici.maxLoanAmount();
		icici.minBlance();
		
	}

	
}
