package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		//1. navigate
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//10. setPosition
		Point p = new Point(900, 600);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
