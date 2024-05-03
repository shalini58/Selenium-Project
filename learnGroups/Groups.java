package learnGroups;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups="smoke")
	public void createLead() {
		System.out.println("Create Lead");
	}

	@Test(groups="sanity")
	public void editLead() {
		System.out.println("Edit Lead");
	}
}
