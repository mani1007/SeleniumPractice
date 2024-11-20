package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImages {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://www.amazon.com");
		
		
		By images = By.tagName("img");
		List<WebElement> imagelist = driver.findElements(images);
		System.out.println("Total no. of images: "+ imagelist.size());
		
		for(WebElement e : imagelist)
		{
			String altValue = e.getAttribute("alt");
			String srcValue = e.getAttribute("src");
			
			System.out.println(altValue + "---" + srcValue);
		}
		
	}

}
