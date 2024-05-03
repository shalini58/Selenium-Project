package learnSet;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] num = {2,3,4,5,6,7,3,7,8,9,1,5,5,6,4};
		
		Set<Integer> uniqueSet = new HashSet<Integer>();
		Set<Integer> onlyUnique = new HashSet<Integer>();
		
		for (int i = 0; i < num.length; i++) {
			boolean add = uniqueSet.add(num[i]);
			if(!add) {
				onlyUnique.add(num[i]);
			}
			
			
		}
		
		System.out.println(onlyUnique);
	}

}
