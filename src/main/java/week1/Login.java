package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		//Launch Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.get("http://leaftaps.com/opentaps/");
		//set implicitlyWait 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximize the Browser
		driver.manage().window().maximize();
		//Enter User Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		//Click Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		

	}
}
