package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy {

	static WebDriver driver;

		public static void main(String[] args) {

			driver = new ChromeDriver();// 123
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

			// create a webelement + perform an action on it(click, sendKeys,
			// gettext,isDisplayed)

			 //1. id: unique attribute: can not be duplicate -- 1st
//			driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//			driver.findElement(By.id("input-password")).sendKeys("test@123");
			
			//2a. name: can be duplicate -- 2nd
//			driver.findElement(By.name("firstname")).sendKeys("test");
//			driver.findElement(By.name("lastname")).sendKeys("automation");
			
			//2b. name: can be duplicate -- 2nd
//			By fn = By.name("firstname");
//			By ln = By.name("lastname");
//			
//			ElementUtil eleUtil = new ElementUtil(driver);
//			eleUtil.doSendKeys(fn, "test");
//			eleUtil.doSendKeys(ln, "automation");
			
			//2c. name: can be duplicate -- 2nd
//			String fn = "firstname";
//			String ln = "lastname";
//			
//			ElementUtil eleUtil = new ElementUtil(driver);
//			eleUtil.doSendKeys("name", fn, "test");
//			eleUtil.doSendKeys("name", ln, "automation");

			
			//3a. class name: its not a unique attribute, can be duplicate - 3rd
//			driver.findElement(By.className("form-control")).sendKeys("testing");
			
//			//3b. class name: its not a unique attribute, can be duplicate - 3rd
//			By fn = By.className("form-control");
//			
//			ElementUtil eleUtil = new ElementUtil(driver);
//			eleUtil.doSendKeys(fn, "test");
			
			//3c. class name: its not a unique attribute, can be duplicate - 3rd
//			String fn = "form-control";
//			
//			ElementUtil eleUtil = new ElementUtil(driver);
//			eleUtil.doSendKeys("class", fn, "test");
			
			
			//4a. xpath: its not an attribute: address of the webelement in HTML DOM
			//XML PATH
//			driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("test");
//			driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Automation");
			
			//4b. xpath: its not an attribute: address of the webelement in HTML DOM
//			By fn = By.xpath("//*[@id=\"input-firstname\"]");
//			By ln = By.xpath("//*[@id=\"input-lastname\"]");
//			
//			ElementUtil elUtil = new ElementUtil(driver);
//			elUtil.doSendKeys(fn, "test");
//			elUtil.doSendKeys(ln, "Automation");
			
			//4c. xpath: its not an attribute: address of the webelement in HTML DOM
//			String fn = "//*[@id=\"input-firstname\"]";
//			String ln = "//*[@id=\"input-lastname\"]";
//			
//			ElementUtil elUtil = new ElementUtil(driver);
//			elUtil.doSendKeys("xpath", fn, "test");
//			elUtil.doSendKeys("xpath", ln, "automation");
			
			
			
			//5a. css: cascaded style sheet: its not an attribute:
//			driver.findElement(By.cssSelector("#input-firstname")).sendKeys("testing");
//			driver.findElement(By.cssSelector("#input-lastname")).sendKeys("automation");
			
			
			//5b. css: cascaded style sheet: its not an attribute:
//			By fn = By.cssSelector("#input-firstname");
//			By ln = By.cssSelector("#input-lastname");
//			
//			ElementUtil elUtil = new ElementUtil(driver);
//			elUtil.doSendKeys(fn, "test");
//			elUtil.doSendKeys(ln, "Automation");
			
			//5c. css: cascaded style sheet: its not an attribute:
//			String fn = "#input-firstname";
//			String ln = "#input-lastname";
//			
//			ElementUtil elUtil = new ElementUtil(driver);
//			elUtil.doSendKeys("css", fn, "test");
//			elUtil.doSendKeys("css", ln, "automation");
			
			//6a. linkText: only for links : for the text of the link
			//html dom: <a> -- link
//			driver.findElement(By.linkText("Login")).click();
			
			//6b. linkText: only for links : for the text of the link
//			By loginLink = By.linkText("Login");
//			ElementUtil eleUtil = new ElementUtil(driver);
//			eleUtil.doClick(loginLink);
			
			//6c. linkText: only for links : for the text of the link
//			String loginLink = "Login";
//			ElementUtil eleUtil = new ElementUtil(driver);
//			eleUtil.doClick("link", loginLink);
			
			//7a. partialLinkText: only for links : for the partial text of the link
//			driver.findElement(By.partialLinkText("Forgotten")).click();

			//Forgotten username
			//Forgotten password
			
			//7b. partialLinkText: only for links : for the partial text of the link
//			By forgotLink = By.partialLinkText("Forgotten");
//			
//			ElementUtil eleUtil = new ElementUtil(driver);
//			eleUtil.doClick(forgotLink);
			
			//7c. partialLinkText: only for links : for the partial text of the link
//			String forgotLink = "Forgotten";
//			
//			ElementUtil eleUtil = new ElementUtil(driver);
//			eleUtil.doClick("partiallink", forgotLink);
			
			//8a. tagName:html tag: 
//			String header = driver.findElement(By.tagName("h1")).getText();
//			System.out.println(header);
			
			//8b. tagName:html tag:
//			By pageHeader = By.tagName("h1");
//			ElementUtil eleUtil = new ElementUtil(driver);
//			String header = eleUtil.doGetElementText(pageHeader);
//			System.out.println(header);
			
			//8c. tagName:html tag:
//			String headerId = "h1";
//			ElementUtil eleUtil = new ElementUtil(driver);
//			String header = eleUtil.doGetElementText("tagname", headerId);
//			System.out.println(header);

	}

}
