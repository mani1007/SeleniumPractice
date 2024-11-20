package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DisableElementClickSendKeys {

	static WebDriver driver;

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser("Chrome");
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

//		driver.findElement(By.id("pass")).click(); //No Exception
//		
//		driver.findElement(By.id("pass")).sendKeys("testing"); //ElementNotInteractableException
		
//		driver.findElement(By.id("fname")).sendKeys(null);
		// java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
		
//		driver.findElement(By.id("fname")).sendKeys("null");  //No Exception
		
		StringBuilder sb = new StringBuilder("Automation ");
		String str = "Testing ";
		
		driver.findElement(By.id("fname")).sendKeys(sb, str + "Mani");
		
//		Argument of SendKeys() is not a String. It is actually CharacterSequence...
//		CharacterSequence is an Interface and its sub classes are:
//			1. String
//			2. String Builder
//			3. String Buffer
//			
//		We can use any one or all together like in the example above.
//		Also, we can use them comma separated or concatenation with +
	}

}
