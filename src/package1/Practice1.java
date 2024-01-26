package package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		System.setProperty("webdriver.chromedriver","./drivers.chromedrivers.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to("https://qa-adminportal.synappx.sharp.eu/#");
		//or
		Thread.sleep(3000);
		URL url=new URL("https://www.youtube.com");
		driver.navigate().to(url);
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
	}
	

}
