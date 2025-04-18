package uploaddownload;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class UploadDownload {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String fruitName = "Apple";
		String updatedValue = "603";
		String fileName = "/Users/rahulshetty/downloads/download.xlsx";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		//download
		
		driver.findElement(By.cssSelector("#downloadButton")).click();
		
		//Edit excel - getColumnNumber of Price -getRownumber of APple-> update excel with row,col
			int col =getColumnNumber(fileName,"price");
			int row = getRowNumber(fileName,"Apple");
			Assert.assertTrue(updateCell(fileName,row,col,updatedValue));
		
		
		
		//upload
		WebElement upload =driver.findElement(By.cssSelector("input[type='file']"));
		upload.sendKeys("/Users/rahulshetty/downloads/download.xlsx");
		
		
		//wait for success message to show up and wait for disappear
		By toastLocator = By.cssSelector(".Toastify__toast-body div:nth-child(2");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));
		String toastText = driver.findElement(toastLocator).getText();
		System.out.println(toastText);
		Assert.assertEquals("Updated Excel Data Successfully.",toastText);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
			
		//verify updated excel data showing in the web table
		String priceColumn= driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		String actualPrice = driver.findElement(By.xpath("//div[text()='"+fruitName+"']/parent::div/parent::div/div[@id='cell-"+priceColumn+"-undefined']")).getText();
		System.out.println(actualPrice);
		Assert.assertEquals(updatedValue, actualPrice);
		
		
		
		

}
