package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FEsUtil {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://www.amazon.com");
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		int totalLinks = getElementsCount(links);
		int totalImages = getElementsCount(images);

		System.out.println("Total no. of Links: " + totalLinks);
		System.out.println("Total no. of Images: " + totalImages);
//		
//		ArrayList<String> allLinkText = getElementsText(links);
//		
//		if(allLinkText.contains("Help"))
//			System.out.println("PASS");
//		else
//			System.out.println("FAIL");	
		
		ArrayList<String> allAltValues = getElementsAttribute(images,"alt");
		
		System.out.println(allAltValues);
		
		
	}
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator)
	{
		return getElements(locator).size();
	}
	
	public static ArrayList<String> getElementsText(By locator)
	{
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleText = new ArrayList<String>();
		
		for(WebElement e : eleList)
		{
			String text = e.getText();
			if(text.length()!=0)
			{
				eleText.add(text);
			}
		}
		return eleText;
	}
	
	
	public static ArrayList<String> getElementsAttribute(By locator, String attrName)
	{
		List<WebElement> eleList = getElements(locator);
		ArrayList<String> eleAttr = new ArrayList<String>();
		
		for(WebElement e : eleList)
		{
			String text = e.getAttribute(attrName);
			if(text.length()!=0)
			{
				eleAttr.add(text);
			}
		}
		return eleAttr;
	}

}
