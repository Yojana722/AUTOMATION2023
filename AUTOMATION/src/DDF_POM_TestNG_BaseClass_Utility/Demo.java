package DDF_POM_TestNG_BaseClass_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo {
	static ExtentTest test;
	static ExtentReports report;

	@BeforeClass
	public void startTest() {
		report = new ExtentReports(System.getProperty("user.dir") + "ExtentReportResults.html");
		test = report.startTest("Demo");
	}

	@Test
	public void extentReportsDemo() {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\DEC2022\\AUTOMATION\\driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		//Handling of notifications
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);//upcasting
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		if (driver.getTitle().equals("Google")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
	}

	@AfterClass
	public void endTest() {
		report.endTest(test);
		report.flush();
	}

}
