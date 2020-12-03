package SeleniumDemo;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2Sel {

	@Test
	public void setupTour() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "//chrome path in system//");
	    ChromeOptions options  = new ChromeOptions();
	    //options.addArguments("incognito");
	    options.addArguments("--disable-popup-blocking");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	   // driver = new ChromeDriver(capabilities);
	    
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
			
		driver.navigate().to("https://google.com");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello World");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		
		
		driver.manage().deleteAllCookies();
		
		driver.quit();
	}
}
