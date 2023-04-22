package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2_getOptions_SizeOfListBox {

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
		
		//3. 
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());//31
		
		for(int i=0; i<=allOptions.size()-1; i++) {
			System.out.println(allOptions.get(i).getText());//Returns the element at the specified position in this list.
		}
		
		Thread.sleep(2000);
		driver.quit();
	}
}
