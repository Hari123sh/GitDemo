package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "./driver.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		String actual=driver.findElement(By.xpath("//div[@id='keepMeLoggedInCaptionContainer']")).getAttribute("title");
		System.out.println(actual);
		String expected="Do not select if this computer is shared";
		if(actual.equals(expected))
		{
			System.out.println("Tooltip text is proper");
		}
		else {
			System.out.println("Tooltip text is not proper");
		}
		driver.close();
	}

}
