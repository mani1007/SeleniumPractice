package testngsessions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@BeforeMethod
	public void createUser() {
		System.out.println("BM -- create user");
	}

	@Test(invocationCount = 5, priority = 2)
	public void createUserTest() {
		System.out.println("createUserTest");
	}

	@Test(invocationCount = 3, priority = 1)
	public void paymentTest() {
		System.out.println("paymentTest");
	}

	@AfterMethod
	public void deleteUser() {
		System.out.println("AM -- deleteUser");
	}

}
