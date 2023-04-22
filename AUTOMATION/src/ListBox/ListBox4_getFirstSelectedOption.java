package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox4_getFirstSelectedOption {

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
		
		s.selectByIndex(20);//21
		
		//getFirstSelectedOption ->return type -> WebElement
		System.out.println(s.getFirstSelectedOption().getText());//21
		
		//getAllSelectedOptions -> return type -> List<WebElement>
		List<WebElement> allOptions = s.getAllSelectedOptions();
		for(WebElement option:allOptions) {
			System.out.println(option.getText());//21
		}
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
