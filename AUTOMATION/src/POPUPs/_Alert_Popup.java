package POPUPs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _Alert_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("1");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());//Do you really want to delete this Customer?
		
		//alt.dismiss();//Cancel
		
		alt.accept();
		
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());//Customer Successfully Delete!
		
		alt1.accept();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
