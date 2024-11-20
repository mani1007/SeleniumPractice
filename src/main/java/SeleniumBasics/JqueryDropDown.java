package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JqueryDropDown {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Consent']")));
        acceptButton.click();

        By dropDownlocator = By.id("justAnInputBox");
        By optionslocator = By.xpath("//span[@class='comboTreeItemTitle']");
        
//        doSelectMultipleOptions(dropDownlocator,optionslocator,"choice 3");
//        doSelectMultipleOptions(dropDownlocator,optionslocator,"choice 3","choice 1","choice 2 1");
        doSelectMultipleOptions(dropDownlocator,optionslocator,"all");
		
	}
	
	/**
	 * This method helps you to select single, multiple and all options in a multiple select dropDown.
	 * Please Pass "all" in value parameter in case of all selection
	 * @param dropDownlocator
	 * @param optionslocator
	 * @param value
	 * @throws InterruptedException
	 */
	public static void doSelectMultipleOptions(By dropDownlocator, By optionslocator, String... value) throws InterruptedException
	{
		 driver.findElement(dropDownlocator).click();
	        
	        Thread.sleep(3000);
	        
			List<WebElement> multiSelectElement = driver.findElements(optionslocator);
			
			if(value[0]=="all")
			{
				for(WebElement e : multiSelectElement)
				{
					try {
						e.click();
					}
					catch(ElementNotInteractableException ex){
						break;
					}
				}
			}
			else
			{
				for(WebElement e : multiSelectElement)
				{
					String text = e.getText();
					for(String s:value)
					{
						if(text.equals(s))
						{
							e.click();														
						}	
					}							
				}
			}			
	}
}
