package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practi1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver","./drivers/chromdriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String s=driver.getWindowHandle();
		System.out.println(s);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		String a=driver.getTitle();
		System.out.println(a);
		driver.switchTo().window(s);
		
	}

}
