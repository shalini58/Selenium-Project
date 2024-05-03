package learnAbstraction;

public class SBI implements RBI{

	public void minBlance() {

		System.out.println("1000");
	}

	public void maxLoanAmount() {
 
		System.out.println("1000000");
	}
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.maxLoanAmount();
		sbi.minBlance();
	}

}
