package week1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();

		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		//dd.selectByIndex(2);
		//dd.selectByValue("LEAD_EMPLOYEE");
		//dd.selectByVisibleText("Other");
		List<WebElement> allOptions = dd.getOptions();
		int size = allOptions.size();
		System.out.println(size);
		dd.selectByIndex(size-1);
		for (WebElement eachOpt : allOptions) {
			String text = eachOpt.getText();
			System.out.println(text);
		}
	}
}
