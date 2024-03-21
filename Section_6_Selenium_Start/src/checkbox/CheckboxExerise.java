package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxExerise {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		driver.manage().window().maximize(); // window max

		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
		
		Thread.sleep(2000);
		
		//driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		
		//input[type="checkbox"]
		// to check no of checkbox on webpage
		
		//driver.findElement(By.cssSelector("input[type='checkbox']"))
		driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
