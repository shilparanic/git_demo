package Demo_TestNG.Demo_TestNG;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;


	public class priority_TestNg {
		//Priority --> 1st rank --> 10th rank
		//When you have SAME annotaions for more than one methods. and if you used priority to it.
		//It works on priority. 
		//Higher the priority(in terms of number) higher the order 
		
		//When you have not given an priority to any of the method then Annotations by default it will assume the priority as 0 
		//Priority can be used only for @Test annotaions only
		// -1,0,1,10

		//enable is the tag whihc is used to block the execution of methods
		@Test(priority=1)
		public void m1() {
			System.out.println("@Test M1");
		}
		
		@Test
		public void aM1() {
			System.out.println("@Test aM1");
		}
		
		@Test(priority=-1,enabled=true)
		public void a1M1() {
			System.out.println("@Test a1M1");
		}
		
		@Test(priority=10)
		public void A2M1() {
			System.out.println("@Test A2M1");
		}

	}


