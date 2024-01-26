package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome","./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement uname=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pswrd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		int x=uname.getLocation().getX();
		int y=pswrd.getLocation().getX();
		System.out.println(x);
		System.out.println(y);
		if(x==y) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
