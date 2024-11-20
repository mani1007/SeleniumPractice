package SeleniumBasics;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonTest {

	public static void main(String[] args) throws MalformedURLException {
		
		BrowserUtil br = new BrowserUtil();
		
		br.launchBrowser("firefox");
		
		br.launchURL(new URL("https://www.amazon.com"));
		
		String pageTitle = br.getPageTitle();
		
		if(pageTitle.contains("Amazon"))
			System.out.println("Page title is Correct");
		else
			System.out.println("Page title is incorrect");
		
		String pageUrl = br.getPageURL();
		
		if(pageUrl.contains("amazon.com"))
			System.out.println("Page URL is Correct");
		else
			System.out.println("Page URL is incorrect");
		
		br.closeBrowser();
		

	}

}
