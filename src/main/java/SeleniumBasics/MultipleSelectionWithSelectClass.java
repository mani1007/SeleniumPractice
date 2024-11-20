package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionWithSelectClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement multiDropElement = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(multiDropElement);
		
		System.out.println(select.isMultiple());
		
		if(select.isMultiple())
		{
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("Greater flamingo");
			select.selectByVisibleText("Lesser flamingo");
		}
		
		select.deselectByVisibleText("Greater flamingo");
		//select.deselectAll();
		
		List<WebElement> selectedOptions = select.getAllSelectedOptions();

		for(WebElement e : selectedOptions)
		{
			String text = e.getText();
			System.out.println(text);
		}
	}

}
