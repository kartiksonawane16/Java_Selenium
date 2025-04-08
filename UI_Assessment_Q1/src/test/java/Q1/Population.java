package Q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Population {

	 WebDriver driver;
	    SoftAssert softAssert;

	    @BeforeClass
	    public void setUp() {
	        // Change this path according to your local environment
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        // Initialize ChromeDriver
	        driver = new ChromeDriver();
	        // Implicit wait for element presence
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        // Initialize SoftAssert
	        softAssert = new SoftAssert();
	    }

	    @Test
	    public void testWorldPopulationCounts() {
	        // Open the URL
	        driver.get("https://www.worldometers.info/world-population/");
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
			
	        // Assert using SoftAssert
	        softAssert.assertNotNull(currentPopulation);
	        softAssert.assertNotNull(todayBirths);
	        softAssert.assertNotNull(todayDeaths);
	        softAssert.assertNotNull(todayPopulation);


	        
	    }

	    @AfterClass
	    public void tearDown() {
	        // Perform all soft assertions
	        softAssert.assertAll();
	        // Quit the browser
	        driver.quit();
	    }

}
