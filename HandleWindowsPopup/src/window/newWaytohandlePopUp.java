package window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class newWaytohandlePopUp {

	public static void main(String[] args) {
		
	
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(option);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.manage().window().maximize();

			
		}

}
