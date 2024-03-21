package miscellaneoustopics;

import java.util.*;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSlCertificates1 {
	
	public static void main(String[] args) {
		//SSl certificates

		//Desired capabilities=
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belowe to your local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		
		WebDriver driver=new ChromeDriver(c);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Java_Selenium\\Driver\\chromedriver-win64\\chromediver.exe");
		driver.manage().window().maximize(); // window max




		}



}
