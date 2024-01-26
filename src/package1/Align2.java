package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Align2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		Rectangle unRect=driver.findElement(By.xpath("//input[@name='username']")).getRect();
		Rectangle pswrdRect=driver.findElement(By.xpath("//input[@name='pwd']")).getRect();
		//int x=unRect.getX()+unRect.getWidth();
		//int y=pswrdRect.getX()+pswrdRect.getWidth();
		int x=unRect.getX();
		int y=pswrdRect.getX();
		System.out.println(x);
		System.out.println(y);
		if(x==y) {
			System.out.println("Aligned properly");
		}
		else {
			System.out.println("Not Aligned");
		}
		driver.quit();
	}

}
