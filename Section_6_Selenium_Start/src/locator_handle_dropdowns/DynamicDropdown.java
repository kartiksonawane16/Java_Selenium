package locator_handle_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
		
		driver.manage().window().maximize(); // window max

		//a[@value='MAA']  - Xpath for chennai
		//a[@value='BLR'] - Xpath for banglore

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[@value='MAA']")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		}


}
