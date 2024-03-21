package locator_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorFormPr {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		driver.manage().window().maximize(); // window max

		driver.get("https://rahulshettyacademy.com/angularpractice/"); //URL in the browser
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("kartik");
		//driver.findElement(By.cssSelector("input[class='form-control ng-pristine ng-invalid ng-touched']")).sendKeys("kartik");
		
		driver.findElement(By.cssSelector("input.form-control[name='name']")).sendKeys("kartik");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kartik@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("kartik123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("16/06/1996");
		
		driver.findElement(By.cssSelector(".btn-success")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
		/*
		
		driver.findElement(By.name("name")).sendKeys("rahul");
		
		driver.findElement(By.name("email")).sendKeys("hello@abc.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select abc = new Select(dropdown);
		
		abc.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		
		driver.findElement(By.cssSelector(".btn-success")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());


		 */
	}

}
