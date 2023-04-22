package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG {

	@Test // Mark a class or a method as part of the test.
	public void test() {
		System.out.println("running test method");//message will displayed on console not in report
		Reporter.log("running test method", false);// message will displayed in report but not on console
		Reporter.log("running test method", true); //message will displayed in report and on console
	}
}
