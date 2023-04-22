package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		//4. maximize
		driver.manage().window().maximize();
		
		//8. navigate
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();//google
		Thread.sleep(2000);
		
		driver.navigate().forward();//facebook
		
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		
		driver.quit();

		
	}
}
