package learnMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindOccurence {

	public static void main(String[] args) {

		String cName = "amazon india";
		
		char[] charArray = cName.toCharArray();
		
		Map<Character, Integer> occur = new HashMap<Character, Integer>();
		
		int a = 1;
		
		for (int i = 0; i < charArray.length; i++) {
			if(occur.containsKey(charArray[i])) {
				Integer value = occur.get(charArray[i]);
				occur.put(charArray[i], value+1);
			}
			else {
				occur.put(charArray[i], 1);
			}
			
		}
		System.out.println(occur);
		
		//print one occurence
		
		Set<Entry<Character, Integer>> entrySet = occur.entrySet();
		
		for (Entry<Character, Integer> entry : entrySet) {
			int value = entry.getValue();
			if(value == 1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
	}

}
