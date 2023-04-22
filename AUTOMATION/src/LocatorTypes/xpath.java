package LocatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("qa@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
