package package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//div[contains(@class,'col-md-22')]//button[@type='button']")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
		driver.findElement(By.xpath("//a[normalize-space()='Ballari - Bengaluru']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'col-md-22')]//button[@type='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[contains(@class,'ui-datepicker')]//td/a[text()='14']")).click();
		driver.switchTo().frame("chatbotwindow");
	
	}

}
