package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		//type="file" attribute is mandatory in the element in order to execute this scenario.
		//If this attribute is missing discuss with developer to add this attribute.
		// If not added, DO NOT automate this scenario
		//Example Element: <input type="file" name="upfile"> 
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\1\\OneDrive\\Documents\\Python.txt");
		
		
		// THIRD PARTY tools to execute this scenarion if type="file" attribute is NOT available(But Not advisible due to limitations)
		//sikuli - image based/resolution based
		//autoIT -- only for windows machine -- wont work in docker, headless, jenkins, linux, macos
		
	}

}
