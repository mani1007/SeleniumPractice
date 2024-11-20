package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsPrivacyAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1. Verify the LinkText left to the Privacy Policy Checkbox
		WebElement privacycheckElement = driver.findElement(By.xpath("//input[@name='agree']"));
				
		String leftLinkText = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(privacycheckElement)).getText();
		System.out.println("Link text left to Privacy Policy Checkbox: "+ leftLinkText);
		
		//2. Verify the Element right to Privacy Policy linktext is a checkbox or not
		WebElement privacyLinkElement = driver.findElement(By.linkText("Privacy Policy"));
		
		String typeAttr = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(privacyLinkElement)).getAttribute("type");
		//driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(privacyLinkElement)).click();
		if(typeAttr.equals("checkbox"))
			System.out.println("Element Right to Privacy Policy Link is a Checkbox");
		else
			System.out.println("Element Right to Privacy Policy Link is NOT a Checkbox");
		
	}

}
