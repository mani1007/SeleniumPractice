package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginPage {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		
		br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By user = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil element = new ElementUtil(driver);
		element.doSendKeys(user,"automation123@nal.com");
		element.doSendKeys(pwd,"test@123");

	}

}
