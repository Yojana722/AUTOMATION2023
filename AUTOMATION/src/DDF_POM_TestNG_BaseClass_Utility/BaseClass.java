package DDF_POM_TestNG_BaseClass_Utility;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver;
	public static void openBrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\DEC2022\\AUTOMATION\\driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		//Handling of notifications
		option.addArguments("--disable-notifications");
		
		driver = new ChromeDriver(option);//upcasting
		
		driver.manage().window().maximize();
		
		driver.navigate().to(Utility.getPropertyFileData("url"));
		//Thread.sleep(2000);
		
		//1. implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//2. Explicit Wait
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		 
		 
		//3. fluent wait
			Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(20))
					.ignoring(NoSuchElementException.class)
					.pollingEvery(Duration.ofSeconds(5));
	}
}
