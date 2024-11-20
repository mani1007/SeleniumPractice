package SeleniumBasics;

import java.util.function.Supplier;

import org.openqa.selenium.Credentials;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		String user = "admin";
		String pass = "admin";
		
		//Basic Auth
		//driver.get("https://"+user+":"+pass+"@the-internet.herokuapp.com/basic_auth");
		
		
		//Selenium 4.x
		//HasAuthentication
		Supplier<Credentials> cred = () -> new UsernameAndPassword(user, pass);
		((HasAuthentication)driver).register(cred);
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		//Other Types of Auth
//		JWT Keys
//		API Token
//		oAuth 1.0
//		oAuth 2.0
//		Primitive Authentication
//		Digestive Authentication
		

	}

}
