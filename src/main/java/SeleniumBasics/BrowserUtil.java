package SeleniumBasics;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
		
		WebDriver driver;
		
		/**
		 * This method helps to launch a browser of your own preference 
		 * @param browserName
		 * @return driver
		 */
		public WebDriver launchBrowser(String browserName)
		{			
			switch(browserName.toLowerCase().trim())
			{
				
			case "chrome":
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				driver = new FirefoxDriver();
				break;
				
			case "edge":
				driver = new EdgeDriver();
				break;
				
			default:
				System.out.println("Please pass a proper browser name.." + browserName);
				throw new BrowserException("BROWSER NOT FOUND");
			}
			
			return driver;			
		}
		
		/**
		 * This method helps you to launch a URL with string type url and throws exception in case of invalid URL
		 * @param url
		 */
		public void launchURL(String url)
		{
			if(url == null)
				throw new BrowserException("URL is NULL");
			
			if(url.indexOf("http")==0)
				driver.get(url);
			else
				throw new BrowserException("Invalid URL");
		}
		
		public void launchURL(URL url)
		{
			if(url == null)
				throw new BrowserException("URL is NULL");
			/*
			String strUrl = String.valueOf(url);
			
			if(strUrl.indexOf("http")==0)
				driver.get(strUrl);
			else
				throw new BrowserException("Invalid URL");
				*/
			
			driver.navigate().to(url);
		}
		
		/**
		 * This method helps you get the page title
		 * @return
		 */
		public String getPageTitle()
		{
			return driver.getTitle();
		}
		
		/**
		 * This method helps you to get the current page URL
		 * @return
		 */
		public String getPageURL()
		{
			return driver.getCurrentUrl();
		}
		
		/**
		 * This method helps you to close the browser.
		 */
		public void closeBrowser()
		{
			driver.close();
		}
		
		/**
		 * This method helps you to quit the browser.
		 */
		public void quitBrowser()
		{
			driver.quit();
		}

}
