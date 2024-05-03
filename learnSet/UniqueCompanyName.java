package learnSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCompanyName {

	public static void main(String[] args) {

		String companyName = "google";
		
		char[] charArray = companyName.toCharArray();
		
		Set<Character>  uniqueChar = new HashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			uniqueChar.add(charArray[i]);
			
		}
		System.out.println(uniqueChar);
	}

}
