package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1_select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		Thread.sleep(4000);
		
		//1. step 1
		//findElement -> return type -> WebELement
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		//2. step 2
		Select s = new Select(day);
		
		//3. step 3
		//s.selectByIndex(9);//10
		//s.selectByValue("20");//20
		s.selectByVisibleText("30");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
