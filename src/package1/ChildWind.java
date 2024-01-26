package package1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWind {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		System.setProperty("webdriver.driver.chrome","./drivers.chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		String parentID=driver.getWindowHandle();
		System.out.println(parentID);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='SwitchTo']"))).build().perform();
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parentID);
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set <String> ch=driver.getWindowHandles();
        for(String wid: ch)
		{
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle());
			if(!parentID.equals(wid))
			{
				driver.close();
			}
		}

	}

}
