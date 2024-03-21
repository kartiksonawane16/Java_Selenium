package locator_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		driver.manage().window().maximize(); // window max

		driver.get("https://www.spicejet.com/"); // URL in the browser

		// dismiss the alerts
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		driver.findElement(By.cssSelector("//div[contains(text(),'one way')]")).click();

		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//input[@type='text']")).click();

		driver.switchTo().alert().getText();

	}

}
