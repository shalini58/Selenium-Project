package learnMap;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {

		Map<Integer, String>  empDetails = new HashMap<Integer, String>();
		
		empDetails.put(10001, "Shalini");
		empDetails.put(1002, "Sathya");
		empDetails.put(1003, "Hari");
		
		System.out.println(empDetails);
		
		System.out.println(empDetails.remove(1003));
		System.out.println(empDetails);
		
		System.out.println(empDetails.get(1002));
		System.out.println(empDetails.containsKey(1001));
	}

}
