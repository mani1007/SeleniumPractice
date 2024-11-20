package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGMapHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(5000);
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String mapXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']/*[name()='g']";
		List<WebElement> stateList = driver.findElements(By.xpath(mapXpath));
		System.out.println(stateList.size());
		
		Actions action = new Actions(driver);
		
		for(WebElement e : stateList)
		{
			action.moveToElement(e).perform();
			String text = e.getAttribute("id");
			System.out.println(text);
			Thread.sleep(500);
		}
		
	}

}
