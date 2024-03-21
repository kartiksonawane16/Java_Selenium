package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxEx2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		driver.manage().window().maximize(); // window max

		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
		
		Thread.sleep(1000);

		driver.findElement(By.id("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True

		
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false

		// size of check box
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}

}
