package POPUPs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _ChildBrowserPopup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		Thread.sleep(5000);

		// 2. getWindowHandles
		Set<String> idsOfBothWindows = driver.getWindowHandles();

		ArrayList<String> al = new ArrayList<String>(idsOfBothWindows);
		System.out.println(al.get(0));// main window id
		System.out.println(al.get(1));// child window id 
		
		driver.switchTo().window(al.get(1));//child window
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(al.get(0));//parent window
		
		driver.findElement(By.xpath("//input[@name='home']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();		
	}
}
