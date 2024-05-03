package learnInheritance;

public class SmartPhone extends Android{
	 
	public void connectWhatsapp() {
		System.out.println("Connect Whatsapp");
	}

	public static void main(String[] args) {
		
		SmartPhone smart = new SmartPhone();
		smart.makeCall();
		smart.takeVedio();
		smart.connectWhatsapp();
		smart.saveContact();
		smart.sendMsg();
	}

}
