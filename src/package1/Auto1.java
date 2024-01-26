package package1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"));
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		driver.findElement(By.xpath("//a[normalize-space()='Windows']")).click();
		Thread.sleep(5000);
		/*Set a =driver.getWindowHandles();
		System.out.println(a);
		String b=driver.getWindowHandle();
		System.out.println(b);*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		Thread.sleep(3000);
		Set c =driver.getWindowHandles();
		System.out.println(c);
		String d=driver.getWindowHandle();
		System.out.println(d);
		

	}

}
