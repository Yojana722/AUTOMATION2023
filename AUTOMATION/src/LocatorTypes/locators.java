package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		//1. navigate
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//1. tagName
		//driver.findElement(By.tagName("input")).sendKeys("qa@gmail.com");
		
		//2. id
		driver.findElement(By.id("email")).sendKeys("qa@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("qa@123");
		Thread.sleep(4000);
		
		//3. name
		//driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		//4. className
		driver.findElement(By.className("_8esh")).click();
		driver.quit();
		}
}
