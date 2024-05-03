package learnAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	@Test
	public void main() {
		
		String s1 = "TestLeaf";
		String s2 = "TESTLEAF";
		
		//Hard Assertion
//		Assert.assertEquals(s1, s2);
//		
//		System.out.println("Lines are Equal");
		
		//Soft Assertion 
	
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(s1, s2);
		System.out.println("Lines are Equal");
		sa.assertAll();
	}
	

}
