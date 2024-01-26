package package1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowH {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./drivers.chromedrivere.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		Set<String> allWindowIds=driver.getWindowHandles();	
		for(String wid: allWindowIds)
		{
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle());
			//driver.quit();
		}
	}

}
