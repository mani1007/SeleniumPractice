package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {
		
	@Test(priority = 1)
	public void titleTest()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "30-Day Advanced Free Trial | OrangeHRM", "Title Mismatch");
		//System.out.println("Title: " + title);
	}

	@Test(priority = 2)
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("30-day-free-trial"));
		//System.out.println("URL: " + url);
	}
	 
	@Test(priority = 3)
	public void imageTest()
	{
		boolean flag = driver.findElement(By.xpath("/html/body/nav/div/a/img")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Image Display: " + flag);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
