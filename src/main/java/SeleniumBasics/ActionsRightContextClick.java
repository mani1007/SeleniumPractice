package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRightContextClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightElement = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(rightElement).perform();
		
		//direct click on the element of right click
		//driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		List<WebElement> eleList = driver.findElements(By.cssSelector("ul.context-menu-list > li:not(.context-menu-separator)"));
		
		for(WebElement e: eleList)
		{
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains("Delete"))
			{
				//e.click();
				actions.click(e).perform();
				break;
			}
		}
		

	}

}
