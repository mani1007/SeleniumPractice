package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinksConcept {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("Chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By links = By.tagName("a");
		
		List<WebElement> linklist = driver.findElements(links);
		System.out.println("Total no. of links: "+ linklist.size());
		
//		for(int i=0; i<linklist.size();i++)
//		{
//			WebElement element = linklist.get(i);
//			String linkText = element.getText();
//			if(linkText.length()!=0)
//			{
//				System.out.println(linkText);
//			}			
//		}
		
		for(WebElement e : linklist)
		{
			String linkText = e.getText();
			if(linkText.length()!=0)
				{
					System.out.println(linkText);
				}
		}
		
		By linkattr = By.className("form-control");
		
		List<WebElement> forms = driver.findElements(linkattr);
		
		for (WebElement e : forms)
		{
			e.sendKeys("testing");
		}

	}

}
