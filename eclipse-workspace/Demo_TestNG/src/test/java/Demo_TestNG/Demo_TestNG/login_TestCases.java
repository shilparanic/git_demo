package Demo_TestNG.Demo_TestNG;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	public class login_TestCases {


		//Though my test got failed or Error or exception .It is still proceeding for next test case which means next @Test is going to run
		//It is built to testing purpose
		
		@BeforeSuite
		public void dependencyTriggering() {
		BrowserUtility.launchBrowser("ch");
		}
		
		
		@AfterMethod
		public void settingURL() {
			if(BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed())
			{
				BrowserUtility.driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
				wait.until(ExpectedConditions.visibilityOf(BrowserUtility.driver.findElement(By.id("email_field"))));	
			}
		
		}
		@Test
		public void checkLoginSuccessOrNot_InvalidCredentials() throws Exception{
			System.out.println("11111");
		BrowserUtility.loginToBrowser("admin123@gmail.com", "admin3");
		}
		
		@Test
		public void checkLoginSuccessOrNot_ValidCredentials() throws Exception{
			System.out.println("2222");
		BrowserUtility.loginToBrowser("admin123@gmail.com", "admin123");
		}
		@AfterSuite
		public void tearDownDependencies() {
			BrowserUtility.quitBrowser();
		}
	}

	

