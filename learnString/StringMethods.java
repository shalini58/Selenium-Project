package learnString;

public class StringMethods {

	public static void main(String[] args) {
		//String literal
		String s = "Test Leaf";
		String S1= "Welcome to Test Leaf";
		
		//String Object
		String s2 = new String("TesTLeaf");
		
		//To  compare strings
		boolean equals = s.equals(s2);
		System.out.println(equals);

		System.out.println(s == s2);
		
		//to ignore Case
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		
		//to get the length of string
		int length = s.length();
		System.out.println(length);
		
		//to get particular character
		char[] charArray = s.toCharArray();
		System.out.println(charArray[7]);
		for (int i = 0;  i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		// to get particular string
		char charAt = s.charAt(5);
		System.out.println(charAt);
		
		//to get position of string
		int indexOf1 = s.indexOf('e');
		System.out.println(indexOf1);
	
		int indexOf2 = s.indexOf("Leaf");
		System.out.println(indexOf2);
		
		//to get specific text
		boolean contains = s.contains("Leaf");
		System.out.println(contains);
		
		//to split string
		String[] split = S1.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		String concat = s.concat(S1);
		System.out.println(concat);
		
		//polymorphism  Overloading Concept
		String substring1 = S1.substring(3);
		System.out.println(substring1);
		String substring2 = S1.substring(3, 9);
		System.out.println(substring2);
	}

}
