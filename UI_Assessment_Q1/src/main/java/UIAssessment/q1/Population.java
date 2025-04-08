package UIAssessment.q1;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Population {

	WebDriver driver;
	
	@Test
	public void testWorldPopulationCounts() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		driver.manage().window().maximize(); // window max
		// Implicit wait for element
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.worldometers.info/world-population/");  // URL

		// Get current world population
		WebElement currentPopulationElement = driver.findElement(By.xpath("//div[@class='maincounter-number']"));
		String currentPopulation = currentPopulationElement.getText();
		System.out.println("Current World Population: " + currentPopulation);
		//  //div[@class='maincounter-number']
		
		// Get today's statistics
		WebElement todayBirthsElement = driver.findElement(By.xpath("//span[@rel='births_today']"));
		String todayBirths = todayBirthsElement.getText();
		System.out.println("Today's Births: " + todayBirths);
		//  //span[@rel='births_today']
		
		WebElement todayDeathsElement = driver.findElement(By.xpath("//span[@rel='dth1s_today']"));
		String todayDeaths = todayDeathsElement.getText();
		System.out.println("Today's Deaths: " + todayDeaths);
		// (//span[@class='rts-counter'])[3]  //span[@rel='dth1s_today']
		
		
		WebElement todayPopulationElement = driver.findElement(By.xpath("//span[@rel='absolute_growth']"));
		String todayPopulation = todayPopulationElement.getText();
		System.out.println("Today's Population Change: " + todayPopulation);
		// //span[@rel='absolute_growth']
		
		driver.quit();
	}
	

}
