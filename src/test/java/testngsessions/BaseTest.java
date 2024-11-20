package testngsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import SeleniumBasics.BrowserException;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters({"url","browser","headless"})
	@BeforeTest
	public void launchBrowser(String url, String browser, String headless)
	{
		
		switch(browser.toLowerCase().trim())
		{
			case "chrome":
				ChromeOptions co = new ChromeOptions();
				if(Boolean.parseBoolean(headless))
				{
					co.addArguments("--headless");
				}				
				driver = new ChromeDriver(co);
				break;
				
			case "firefox":
				FirefoxOptions fo = new FirefoxOptions();
				if(Boolean.parseBoolean(headless))
				{
					fo.addArguments("--headless");
				}
				driver = new FirefoxDriver(fo);
				break;
				
			case "edge":
				EdgeOptions eo = new EdgeOptions();
				if(Boolean.parseBoolean(headless))
				{
					eo.addArguments("--headless");
				}
				driver = new EdgeDriver(eo);
				break;
				
			default:
				System.out.println("Invalid Browser name: " + browser + ", Please pass correct browser name");
				throw new BrowserException("Browser Not Found");
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
