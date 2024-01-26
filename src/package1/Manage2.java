package package1;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		Point oldposition=driver.manage().window().getPosition();
		int oldx=oldposition.getX();
		System.out.println(oldx);
		Thread.sleep(3000);
		Point targetpoint=new Point(200,502);
		driver.manage().window().setPosition(targetpoint);
		Thread.sleep(3000);
		Point newP =driver.manage().window().getPosition();
		int x=newP.getX();
		int y=newP.getY();
		System.out.println(x);
		System.out.println(y);
		driver.quit();		
		

	}

}
