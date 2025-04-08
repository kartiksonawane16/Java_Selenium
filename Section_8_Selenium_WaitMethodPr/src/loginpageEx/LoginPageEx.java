package loginpageEx;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageEx {

	public static void main(String[] args) {
		//load webdriver
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		driver.manage().window().maximize(); // window max
		// get web page
		driver.get("https://rahulshettyacademy.com/loginpagePractise/"); // URL in the browser
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		loginPage(driver);

	}

	private static void loginPage(WebDriver driver) {
		//enter user name
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy ");
		driver.findElement(By.id("password")).sendKeys("learning ");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("select[class='form-control']")).click();
		
		WebElement staticDropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Consultant");
		
		driver.findElement(By.id("terms")).click();
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		// clicked on submit button
		driver.findElement(By.id("signInBtn")).click();
		
		w.withTimeout(Duration.ofSeconds(10));
		
	}

}
