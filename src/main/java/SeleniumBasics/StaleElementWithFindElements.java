package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StaleElementWithFindElements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");//v1

		List<WebElement> footerList = driver.findElements(By.cssSelector("footer a"));//v1
		
		for(int i=0;i<footerList.size();i++)
		{
			footerList.get(i).click();
			System.out.println(driver.getTitle());
			driver.navigate().back();
			footerList = driver.findElements(By.cssSelector("footer a"));
		}
		
		
		//ForEach below is giving issues
//		for(WebElement e : footerList) {
//			e.click();
//			driver.navigate().back();
//			footerList = driver.findElements(By.cssSelector("footer a"));
//		}

	}

}
