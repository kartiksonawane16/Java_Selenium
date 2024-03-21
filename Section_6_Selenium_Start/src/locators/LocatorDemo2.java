package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LocatorDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("inputUsername")).sendKeys("kartiksonawane@gamil.com");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		//driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		//driver.findElement(By.xpath("//button[@class ='submit signInBtn']")).click();
		//input[@placeholder='Name']  //button[@class ='submit signInBtn']
		//<scope>test</scope>
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are Successfully logged in.");
	}

}
