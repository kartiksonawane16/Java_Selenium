package miscellaneoustopics;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class ScreenShot3 {
	
	public static void main(String[] args) throws IOException {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
		//	driver.manage().deleteCookieNamed("sessionKey");
		
			
			driver.get("http://google.com");
			
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
			FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
		
	}



}
