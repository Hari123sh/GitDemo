package package1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleni {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		Thread.sleep(3000);
		Navigation nav=driver.navigate();
		driver.get("https://alt-synappxadminportal.sharpb2bcloud.com/#/");
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
		String PS=driver.getPageSource();
		String url=driver.getCurrentUrl();
		String T= driver.getTitle();
		URL u=new URL("https://chime.aws/dialinnumbers/");
		driver.navigate().to(u);
		Thread.sleep(3000);
		driver.switchTo();
		Thread.sleep(3000);
		driver.quit();

	}

}
