package SeleniumBasics;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageLinkGroups {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By linkGroup = By.className("list-group-item");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		ArrayList<String> allGroupLinks = eleUtil.getElementsText(linkGroup);
		
		for(String s : allGroupLinks)
		{
			System.out.println(s);
		}		
		
	}

}
