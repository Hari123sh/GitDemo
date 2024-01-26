package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com");
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Harish");
		driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("Kumar");
		Thread.sleep(3000);
		boolean b=driver.findElement(By.xpath("//*[@class='button start-trial__confirm-button' and @id='Confirm-button']")).isDisplayed();
		//boolean b1=driver.findElement(By.xpath("//*[@id='Confirm-button']")).isEnabled();
		System.out.println(b);
	//	System.out.println(b1);
	
	}
	
}
	
