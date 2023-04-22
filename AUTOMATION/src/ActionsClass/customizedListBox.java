package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedListBox {

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
		//create object of Actions class wrt to WebDriver
		Actions act = new Actions(driver);//keyboard can interact with browser with the help of Actions class
		
		//3. step 3
		act.click(day).perform();
		
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ARROW_UP).perform();//16
		Thread.sleep(2000);

		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);

		act.sendKeys(Keys.ARROW_DOWN).perform();//18
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		driver.quit();

	
	}
}
