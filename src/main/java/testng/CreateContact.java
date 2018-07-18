package testng;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class CreateContact extends ProjectMethods{
	//@Test(invocationCount=2, threadPoolSize=2)
	//@Test(invocationCount=2, invocationTimeOut=100000)
	//@Test(invocationCount=2, threadPoolSize=2, invocationTimeOut=100000)
	@Test(invocationCount=2, successPercentage=50)
	public void createContact() {
		login();
		click(locateElement("linkText", "Contacts"));
		click(locateElement("linkText", "Create Contact"));
		type(locateElement("id", "firstNameField"), "TestLeaf");
		type(locateElement("id", "lastNameField"), "Gopinath");
		click(locateElement("name", "submitButton"));
		closeBrowser();
	}
	
}
