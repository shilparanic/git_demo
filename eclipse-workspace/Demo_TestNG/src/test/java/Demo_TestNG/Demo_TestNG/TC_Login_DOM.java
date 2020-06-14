package Demo_TestNG.Demo_TestNG;

import org.testng.annotations.Test;

public class TC_Login_DOM {

	//TC_Login_01() --> success then only i have to run TC_Login_02
		@Test
		public void TC_Login_01()throws Exception { // Username and password field are present(Displayed) or not
			System.out.println("TC_Login_01 Executed");
			throw new Exception("Intentionally");
		}
		
		@Test(dependsOnMethods="TC_Login_01")
		public void TC_Login_02() {//pass valid username and password and check whetherit is login or not
			System.out.println("TC_Login_02 Executed");
		
		}
	@Test
	public void TC_Login_03() {
		System.out.println("TC_Login_03 Executed");
	}
	@Test
	public void TC_Login_04() {
		System.out.println("TC_Login_04 Executed");
	}
}
	

	


