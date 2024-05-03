package learnPholymorphism;

public class StudentDetails {
	
	public void getStudentInfo(String name) {
		System.out.println(name);
	}
	
	public void getStudentInfo(int stuId) {
		System.out.println(stuId);
	}

	public void getStudeInfo(String name, int phNo) {
		System.out.println(name+phNo);
	}
	
	public static void main(String[] args) {
		
		StudentDetails details =new StudentDetails();
		details.getStudeInfo("Shalini", 79839873);
		details.getStudentInfo(2323);
		details.getStudentInfo("Shalini");
	
	}
	
}
