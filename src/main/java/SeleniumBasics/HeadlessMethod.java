package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessMethod {

	public static void main(String[] args) {
		
		
		/*
		 * ChromeOptions co = new ChromeOptions(); co.addArguments("--headless");
		 * co.addArguments("--incognito"); WebDriver driver = new ChromeDriver(co);
		 */
		 
		
		/*
		 * FirefoxOptions fo = new FirefoxOptions(); //fo.addArguments("--headless");
		 * //fo.addArguments("--incognito"); WebDriver driver = new FirefoxDriver(fo);
		 */
		
		EdgeOptions eo = new EdgeOptions();
		//eo.addArguments("--headless");
		eo.addArguments("--inprivate");
		
		WebDriver driver = new EdgeDriver(eo);
		
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		//driver.close();

	}

}
