package week2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.crystalcruises.com/travel-calendar?year=2018");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> allQUOTE =  driver.findElementsByLinkText("REQUEST A QUOTE1");
		int size = allQUOTE.size();
		System.out.println(size);
		//allQUOTE.get(1).click();
		
		
		
	}

}














