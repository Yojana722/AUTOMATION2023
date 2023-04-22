package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText_partialLinktext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//5. linkText
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//6. partialLinkText
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
