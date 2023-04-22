package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);

		// 1. sendKeys
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("qaauomation");
		Thread.sleep(1000);

		// 2. clear
		email.clear();

		// 3. click
		WebElement createNewAcc = driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]"));

		//4. getText
		String text = createNewAcc.getText();
		System.out.println(text);//Create new account
		
		createNewAcc.click();

		Thread.sleep(4000);

		driver.quit();
	}
}
