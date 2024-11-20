package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementEnabledSelected {

	static WebDriver driver;

		public static void main(String[] args) {
			
			BrowserUtil br = new BrowserUtil();
			driver = br.launchBrowser("Chrome");
			
			driver.get("https://classic.freecrm.com/register/");
			
			boolean flag1 = driver.findElement(By.name("agreeTerms")).isDisplayed();
			System.out.println(flag1);
			
			boolean flag2 = driver.findElement(By.id("submitButton")).isDisplayed();
			System.out.println(flag2);
			
			boolean flag3 = driver.findElement(By.name("agreeTerms")).isSelected();
			System.out.println(flag3);
			
			boolean flag4 = driver.findElement(By.id("submitButton")).isEnabled();
			System.out.println(flag4);
			
			if(!flag3)
				driver.findElement(By.name("agreeTerms")).click();
					
			flag3 = driver.findElement(By.name("agreeTerms")).isSelected();
			System.out.println(flag3);
			
			flag4 = driver.findElement(By.id("submitButton")).isEnabled();
			System.out.println(flag4);
			
			
	}

}
