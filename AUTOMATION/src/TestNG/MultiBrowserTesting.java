package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {

	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException {
		WebDriver driver = null;

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Yojana\\new\\JAN2023\\chromedriver_win32 (13)\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(option);// upcasting
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"E:\\Yojana\\new\\JAN2023\\chromedriver_win32 (13)\\chromedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\Yojana\\new\\JAN2023\\chromedriver_win32 (13)\\chromedriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver",
					"E:\\Yojana\\new\\JAN2023\\chromedriver_win32 (13)\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.quit();
	}
}
