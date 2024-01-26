package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		driver.get("https://dev-smartoffice.sharpb2bcloud.com");

	}

}
