package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AllInOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", ",/drivers.chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Harish");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//div[contains(@class,'col-md-8')]//textarea[@ng-model='Adress']")).sendKeys("#29. MGH Hassan");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srt.harish@gmail.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1000)");
		String value="Arabic";
		driver.findElement(By.xpath("//div[contains(@class,'ui-autocomplete-multiselect')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[contains(@class,'ui-autocomplete')]//li/a[text()='"+value+"']")).click();
		select(driver.findElement(By.xpath("//select[@id='Skills']")), "Android");
		select(driver.findElement(By.xpath("//select[@id='Skills']")), "Android");
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		//String country="Japan";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'selection')]//span/span[@title='Japan']")).click();
		select(driver.findElement(By.xpath("//select[@id='yearbox']")),"1996");
		select(driver.findElement(By.xpath("//select[@placeholder='Month']")),"August");
		select(driver.findElement(By.xpath("//select[@id='daybox']")),"11");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='SwitchTo']"))).build().perform();
		driver.findElement(By.xpath("//a[normalize-space()='Windows']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		
	}
	public static void select(WebElement e,String value)
	{
		Select sel=new Select(e);
		sel.selectByVisibleText(value);
	}

}
