package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		
		Actions act = new Actions(driver);
		
		//1. moveToElement
		//act.moveToElement(more).perform();
		
		//2. contextClick - right click
		//act.contextClick(more).perform();
		
		//3. click - left click
		act.click(more).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
