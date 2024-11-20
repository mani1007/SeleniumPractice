package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediFrames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("Selenium ");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Automation ");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Testing ");
		
		//f3 --> f2 using switch().frame()? : NOOOOOO
		//f3  ---> parentFrame() : f2 : YESSSS
		//f2 --> parentFrame(): f1 : YESSS
		//f3 --> f1 : NOT possible directly
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("is Fun");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("is Web");
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String title = driver.findElement(By.tagName("h3")).getText();
		System.out.println(title);
		

	}

}
