package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		//4. maximize
		driver.manage().window().maximize();
		
		//1. navigate
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//9. setSize
		Dimension d = new Dimension(200, 800);//width - 200, height -800
		driver.manage().window().setSize(d);
		
		Thread.sleep(5000);
		driver.quit();
			
	}
}
