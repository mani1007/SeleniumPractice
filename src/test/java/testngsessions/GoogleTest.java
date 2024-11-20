package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	
	@Test(priority = 1)
	public void titleTest()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google", "Title Mismatch");
		System.out.println("Title: " + title);
	}

	@Test(priority = 2)
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
		System.out.println("URL: " + url);
	}
	
	@Ignore
	@Test(priority = 3)
	//@Test(priority = 3, enabled = false)
	public void imageTest()
	{
		boolean flag = driver.findElement(By.xpath("//*[@id=\"uMousc\"]/img")).isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Image Display: " + flag);
	}
	
	

}
