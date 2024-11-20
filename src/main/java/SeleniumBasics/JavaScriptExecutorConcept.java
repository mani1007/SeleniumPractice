package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/");
		//driver.get("https://classic.crmpro.com");
		driver.get("https://app.hubspot.com/login");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println(url);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		/////Open Cart/////////////
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
//		
//		String url = jsUtil.getUrlByJS();
//		System.out.println(url);
//		
//		jsUtil.refreshBrowserByJS();
//		
//		jsUtil.generateAlert("Automation");
//		
//		jsUtil.generateConfirmPopUp(title);
		
		/////Classic CRM/////////////
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
		
//		Thread.sleep(1000);
//		jsUtil.scrollToPageBottom();
//		Thread.sleep(1000);
//		jsUtil.scrollToPageTop();
		
//		Thread.sleep(1000);
//		jsUtil.scrollPageDown("300");
//		Thread.sleep(1000);
//		jsUtil.scrollToPageTop();
//		Thread.sleep(1000);
//		jsUtil.scrollPageDownMiddlepage();
		
//		jsUtil.zoomChromeEdgeSafari("50");
		
//		WebElement header = driver.findElement(By.xpath("//h3[text()='Companies & Contacts']"));
//		jsUtil.scrollIntoView(header);
//		
//		jsUtil.drawBorder(header);
		
//		WebElement loginForm = driver.findElement(By.id("hs-login"));
//		jsUtil.drawBorder(loginForm);
		
		WebElement userID = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		jsUtil.flash(userID);
		userID.sendKeys("testing@gmail.com");
		jsUtil.flash(password);
		password.sendKeys("testing@123");
		
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		jsUtil.clickElementByJS(loginBtn);
		
		Thread.sleep(4000);
		//to Send Keys using Javascript
		//document.getElementById('username').value="automation@nal.com"
		jsUtil.sendKeysUsingWithId("username", "automation@nal.com");
		
	}

}
