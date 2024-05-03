package learnMap;

import java.util.HashMap;
import java.util.Map;

public class FindIntegerOccurence {

	public static void main(String[] args) {

		int[] num = {1,3,4,5,7,8,9,4,7,6};
		
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < num.length; i++) {
			/*
			 * if(numMap.containsKey(num[i])) { int value = numMap.get(num[i]);
			 * numMap.put(num[i], value+1);
			 * 
			 * }else { numMap.put(num[i], 1); }
			 */
			numMap.put(num[i], numMap.getOrDefault(num[i],0)+1);
		}
		System.out.println(numMap);
	}

}
