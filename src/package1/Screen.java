package package1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\mharishkumar\\Documents\\Bandicam\\img.png");
		FileHandler.copy(f, trg);
		
		WebElement e=driver.findElement(By.xpath("//div[@id='desktop-grid-3']"));
		File f1=e.getScreenshotAs(OutputType.FILE);
		File trg1=new File("C:\\\\Users\\\\mharishkumar\\\\Documents\\\\Bandicam\\\\img1.png");
		FileHandler.copy(f1, trg1);
		
		WebElement ele=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File f2=ele.getScreenshotAs(OutputType.FILE);
		File trg2=new File("C:\\Users\\mharishkumar\\Documents\\Bandicam\\img2.png");
		FileHandler.copy(f2, trg2);
		driver.quit(); 
		
	}

}
