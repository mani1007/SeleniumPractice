package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.xpath("//img[contains(@title,'Vehicle-Registration')]")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("frame-one748593425")));
		driver.findElement(By.name("RESULT_TextField-8")).sendKeys("Automation");

		driver.switchTo().defaultContent();
		
		String vehicleText = driver.findElement(By.tagName("h3")).getText();
		System.out.println(vehicleText);
	}

}
