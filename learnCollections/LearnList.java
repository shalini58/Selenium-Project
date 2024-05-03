package learnCollections;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
		List<String>  list = new ArrayList<String>();
		
		list.add("Shalini");
		list.add("Sathya");
		list.add("Viha");
		list.add("Neha");
		list.add("Meer");
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
	
		System.out.println(list.size());
		System.out.println(list.get(1));
		
		boolean contains = list.contains("Viha");
		System.out.println(contains);
		list.clear();
		boolean empty = list.isEmpty();
		System.out.println(empty);

	}

}
