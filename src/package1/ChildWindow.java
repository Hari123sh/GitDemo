package package1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		String Pwin=driver.getWindowHandle();
		Set <String> allWindowIDS=driver.getWindowHandles();
		for(String wid:allWindowIDS)
		{
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle());
			if(!Pwin.equals(wid))
			{
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(Pwin);
		System.out.println(driver.getTitle());

	}

}
