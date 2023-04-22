package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox3_isMultiple {

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
		
		if(s.isMultiple()) {//true
			System.out.println("list box is multi-selectable");
		}else {
			System.out.println("list box is single selectable");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
