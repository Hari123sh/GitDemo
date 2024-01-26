package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hari {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		driver.get("https://dev-smartoffice.sharpb2bcloud.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.id("1-email")).sendKeys("knaveen@sharpsoftwaredev.onmicrosoft.com");
		driver.findElement(By.linkText("Log in at Microsoft 365")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("passwd")).sendKeys("smpc@2022");
		//driver.findElement(By.cssSelector("#idSIButton9")).click();
		driver.findElement(By.cssSelector("input#idSIButton9")).click();
		driver.findElement(By.cssSelector("[type=checkbox]")).click();
		//driver.findElement(By.cssSelector("input[type=checkbox]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type=submit]")).click();
	}

}
