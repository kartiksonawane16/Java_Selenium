package loginpageEx;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginpage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		
		driver.manage().window().maximize(); // window max
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.id("password")).sendKeys("learning");
		//driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy ");
		driver.findElement(By.id("password")).sendKeys("learning ");
		driver.findElement(By.cssSelector("input[value='user']")).click();
		//Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		// selection from dropdown
		WebElement options = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByValue("consult");
		
		// checkbox
		driver.findElement(By.id("terms")).click();
		
		//button
		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for (int i = 0; i < products.size(); i++)

		{

			products.get(i).click();

		}

		driver.findElement(By.partialLinkText("Checkout")).click();
	}

}
