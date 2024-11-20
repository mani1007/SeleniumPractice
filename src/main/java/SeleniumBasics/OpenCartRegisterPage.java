package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartRegisterPage {
	
	public static String getRandomEmail()
	{
		return "automation"+System.currentTimeMillis()+"@nal.com";
	}

	public static void main(String[] args) {


		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		
		br.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		br.getPageTitle();
		br.getPageURL();
//		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By email = By.id("input-email");
//		By tel = By.id("input-telephone");
//		By pwd = By.id("input-password");
//		By confirmPwd = By.id("input-confirm");
//		
//		By subscribeYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
//		By subscribeNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
//		
//		By terms = By.name("agree");
//		By continueBtn = By.cssSelector("#content > form > div > div > input.btn.btn-primary");
//		
//		By succMsg = By.tagName("h1");
//		
//		ElementUtil element = new ElementUtil(driver);
//		element.doSendKeys(firstName,"Manikandan");
//		element.doSendKeys(lastName,"Kanthasamy");
//		element.doSendKeys(email,getRandomEmail());
//		element.doSendKeys(tel,"1234567890");
//		element.doSendKeys(pwd,"test@123");
//		element.doSendKeys(confirmPwd,"test@123");
//		
//		element.doClick(subscribeYes);
//		element.doClick(terms);
//		
//		element.doClick(continueBtn);
//		
//		String successMsg = element.doGetElementText(succMsg);
		
		
		String firstName = "input-firstname";
		String lastName = "input-lastname";
		String email = "input-email";
		String tel = "input-telephone";
		String pwd = "input-password";
		String confirmPwd = "input-confirm";
		
		String subscribeYes = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input";
		String subscribeNo = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input";
		
		String terms = "agree";
		String continueBtn = "#content > form > div > div > input.btn.btn-primary";
		
		String succMsg = "h1";
		
		ElementUtil element = new ElementUtil(driver);
		element.doSendKeys("id", firstName,"Test");
		element.doSendKeys("id", lastName,"Automation");
		element.doSendKeys("id", email,getRandomEmail());
		element.doSendKeys("id", tel,"88888888");
		element.doSendKeys("id", pwd,"test@123");
		element.doSendKeys("id", confirmPwd,"test@123");

		element.doClick("xpath", subscribeYes);
		element.doClick("name", terms);
		element.doClick("css", continueBtn);
		
		String successMsg = element.doGetElementText("tagname", succMsg);
		
		if(successMsg.contains("Your Account Has Been Created!"))
			System.out.println("Registration Completed Successfully");
		else
			System.out.println("Registration Failed");
		
		br.closeBrowser();
	}

}
