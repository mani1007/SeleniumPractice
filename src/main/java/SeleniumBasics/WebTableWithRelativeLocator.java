package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class WebTableWithRelativeLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement element = driver.findElement(By.linkText("Jasmine.Morgan"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(element)).click();
		String rightUserRole = driver.findElement(with(By.tagName("td")).toRightOf(element)).getText();
		String aboveLink = driver.findElement(with(By.tagName("a")).above(element)).getText();
		String belowLink = driver.findElement(with(By.tagName("a")).below(element)).getText();
		
		System.out.println("User Role of Given Element: "+ rightUserRole);
		System.out.println("User above the Given Element: "+ aboveLink);
		System.out.println("User below the Given Element: "+ belowLink);
	}

}
