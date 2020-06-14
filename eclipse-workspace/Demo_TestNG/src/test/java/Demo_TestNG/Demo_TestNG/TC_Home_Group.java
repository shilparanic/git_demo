package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.Test;

public class TC_Home_Group {

	@Test(groups="Sanity")
	public void TC_Home_01() {
		System.out.println("TC_Home_01 Executed");
	}
	
	@Test(groups="Regression")
	public void TC_Home_02() {
		System.out.println("TC_Home_02 Executed");
	}
}
	

