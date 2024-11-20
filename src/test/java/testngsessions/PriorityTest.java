package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	//Priorities are in the order of -2,-1,0,1,2
	//If multiple test has same priority, the the alphabatical order of method name is prioritized
	//Tests without priority has default priority of zero 
	
	
	@Test(priority = 1)
	public void eTest() {
		System.out.println("e test");
	}

	@Test(priority = 2)
	public void dTest() {
		System.out.println("d test");
	}

	@Test
	public void cTest() {
		System.out.println("c test");
	}

	@Test
	public void aTest() {
		System.out.println("a test");
	}

	@Test(priority = -1)
	public void bTest() {
		System.out.println("b test");
	}

}
