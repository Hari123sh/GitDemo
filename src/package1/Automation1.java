package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		driver.get("https://dev-smartoffice.sharpb2bcloud.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("1-email")).sendKeys("knaveen@sharpsoftwaredev.onmicrosoft.com");
		

	}

}
