package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Inter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chromedriver", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Hari");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,100)");
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		String value="Catalan";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//ul[contains(@class,'ui-autocomplete')]//li//a[text()='"+value+"']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
		sel.selectByVisibleText("Android");
		js.executeScript("window.scroll(100,200)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='combobox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Australia");
		driver.findElement(By.xpath("//input[@type='search']")).click();
		select(driver.findElement(By.xpath("//select[@id='yearbox']")),"1996");
		select(driver.findElement(By.xpath("//select[@placeholder='Month']")),"August");
		select(driver.findElement(By.xpath("//select[@id='daybox']")),"11");
		Thread.sleep(3000);
		driver.quit();
		
	}
	public static void select(WebElement e, String value)
	{
		Select sel1=new Select(e);
		sel1.selectByVisibleText(value);
	}

}
