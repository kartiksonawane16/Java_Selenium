package scrollingandtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingwebpage {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		driver.manage().window().maximize(); // window max
		driver.get("http://qaclickacademy.com/practice.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,540)", "");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement>  list=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		for (int i=0; i<list.size(); i++) {
			
			sum = sum + Integer.parseInt(list.get(i).getText()) ;
		}

		
	}

}
