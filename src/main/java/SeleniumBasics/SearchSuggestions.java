package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSuggestions {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://google.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='L2AGLb']")));
        acceptButton.click();
        
        By searchLocator = By.name("q");
        By suggLocator = By.xpath("//ul[@jsname='bw4e9b']//div[@class='wM6W7d']/span");
        
        ElementUtil eleUtil = new ElementUtil(driver);
        eleUtil.doSearchAndSelectOption(searchLocator,"selenium",suggLocator,"python");
        
	}
	
//	public static void doSearchAndSelectOption(By searchLocator, String searchKey, By suggLocator, String findValue) throws InterruptedException
//	{
//		driver.findElement(searchLocator).sendKeys(searchKey);
//        Thread.sleep(3000);
//        
//        List<WebElement> suggOptions = driver.findElements(suggLocator);
//        System.out.println(suggOptions.size());
//        
//        for(WebElement e : suggOptions)
//        {
//        	String text = e.getText();
//        	if(text.contains(findValue))
//        		e.click();
//        }
//	}

}
