package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Align3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.river.chrome", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		Thread.sleep(3000);
		WebElement UN=driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PSWD=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		int x=UN.getLocation().getX();
		int y=PSWD.getLocation().getX();
		System.out.println("UN:starting  X is " + x + "," + "PSWD: starting x is " + y);
		if(x==y)
		{
			System.out.println("UN and PSWD field Left alignment is proper");
			
		}
		else {
			System.out.println("UN and PSWD field Left alignment is Not proper");
		}
		Rectangle UN1=driver.findElement(By.xpath("//input[@id='username']")).getRect();
		Rectangle PSWD2=driver.findElement(By.xpath("//input[@placeholder='Password']")).getRect();
		
		int RightAlignUN=UN1.getX()+UN1.getWidth();
		int RightAlignPWD=PSWD2.getX()+PSWD2.getWidth();
		System.out.println("UN: Right - " + RightAlignUN + " , PSWD: Right is "+ RightAlignPWD);
		if(RightAlignUN==RightAlignPWD)
		{
			System.out.println("UN and PSWD field right alignment is proper");
		}
		else
		{
			System.out.println("UN and PSWD field Right alignment is Not proper");
		}
		String actual=driver.findElement(By.xpath("//div[@id='keepMeLoggedInCaptionContainer']")).getAttribute("title");
		String expected="Do not select if this  computer is shared";
		if(actual.equals(expected)) {
			System.out.println("Tooltip text is proper");
		}
		else {
			System.out.println("Tooltip text is not proper");
		}
		driver.quit();
	}

}
