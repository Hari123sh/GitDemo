package package1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Auto2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.driver.chrome", "./drivers.chromdriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Harish");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("#29 mgh");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srt.harish@gmail.com");
		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("9483558465");
		driver.findElement(By.cssSelector("input[type='radio']")).click();
		driver.findElement(By.id("checkbox1")).click();
//		WebElement e=driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
//		Select lang=new Select(e);
		driver.findElement(By.xpath("//div[contains(@class,'ui-autocomplete')]")).click();
		String value = "Arabic";
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		driver.findElement(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li/a[text()='"+value+"']")).click();
		WebElement skill=driver.findElement(By.id("Skills"));
		Select sel=new Select(skill);
		sel.selectByVisibleText("Android");
		//0Thread.sleep(2000);
		//String title= "Bangladesh";
		//driver.findElement(By.xpath("//span[contains(@class,'select2')]//span/span[text()='"+title+"']")).click();
		//WebElement day =driver.findElement(By.xpath("//select[@id='daybox']"));
		select(driver.findElement(By.xpath("//select[@id='daybox']")),"11");// select(day."11")
		select(driver.findElement(By.xpath("//select[@placeholder='Month']")),"August");
		select(driver.findElement(By.xpath("//select[@id='yearbox']")),"1996");
		
	 
	}
	public static void select(WebElement e, String value)
	{
		Select sel=new Select(e);
		sel.selectByVisibleText(value);
	}
}
