package package1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String Pid=driver.getWindowHandle();
		System.out.println("Parent Window " + Pid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.naukri.com/mnc-jobs?src=discovery_trendingWdgt_homepage_srch']")).click();
		Thread.sleep(2000);
		String Cid=driver.getWindowHandle();
		System.out.println("Child window " + Cid);
		System.out.println("Child title" + driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-label='Fresher Jobs']")).click();
		driver.switchTo().window(Pid);
		System.out.println("Parent Title " + driver.getTitle());
		Set <String > allIds=driver.getWindowHandles();
		System.out.println(allIds);
		for(String wid:allIds)
		{
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle());
			if(!Pid.equals(wid))
			{
				driver.close();
			}
			
		}

	}

}
