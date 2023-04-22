package POPUPs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _ChildBrowserPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Yojana\\new\\DEC2022\\chromedriver_win32 (12)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcasting

		driver.manage().window().maximize();

		driver.navigate().to("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		
		//1. getWindowHandle
		String idOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);//CDwindow-11C57760B1757DF1408B53EDF7DA0E57
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		
		//2. getWindowHandles
		Set<String> idsOfBothWindows = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(idsOfBothWindows);
		System.out.println(al.get(0));//main window id
		System.out.println(al.get(1));//child window id -CDwindow-5D0034AC7B9BC6FDF3C9C78F6359A011
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
