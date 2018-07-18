package testng;

import org.testng.annotations.Test;

public class LearnPriority {
	// @Test(priority=2)
	@Test(expectedExceptions=RuntimeException.class)
	public void createLead() {
		System.out.println("i am createLead");
		throw new RuntimeException();
	}
	// @Test(priority=1)
	@Test(dependsOnMethods= {"leaf.Lead.LearnPriority.mergeLead",
	"leaf.Lead.LearnPriority.createLead"}, enabled=false)
	public void editLead() {
		System.out.println("i am editLead");
	}

	// @Test(priority=1)
	@Test(dependsOnMethods="leaf.Lead.LearnPriority.createLead",
			priority=-1, alwaysRun= true)
	public void mergeLead() {
		System.out.println("i am mergeLead");
	}
	@Test
	public void Leads() {
		System.out.println("i am Leads");
	}
}

