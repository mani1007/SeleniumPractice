package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		//1. Build and perform Actions with Actions class
		//actions.clickAndHold(sourceElement).moveToElement(targetElement).release().perform();
		
		//2. Build Actions with Action Interface and perform Actions with Actions class
//		Action action = actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build();
//		action.perform();
		
		//3.same actions with Drag and Drop
		actions.dragAndDrop(sourceElement, targetElement).perform();

	}

}
