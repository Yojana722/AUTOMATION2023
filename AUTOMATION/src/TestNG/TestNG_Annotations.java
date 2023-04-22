package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	@BeforeClass
	public void openBrowser() {
      //open browser
	}

	@BeforeMethod
	public void login() {
      //login
	}

	@Test
	public void verifyUN() {
      //verify username
	}

	@Test
	public void verifyPWD() {
     //verify password
	}

	@AfterMethod
	public void logOut() {
     //logout
	}

	@AfterClass
	public void closeBrowser() {
     //close browser
	}
}
