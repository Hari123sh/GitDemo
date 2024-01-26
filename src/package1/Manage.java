package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Point P=driver.manage().window().getPosition();
		Dimension D=driver.manage().window().getSize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println(D);
		System.out.println(P);
		driver.quit();


	}

}
