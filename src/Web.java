import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.Google.com");
		Navigation nav=driver.navigate();
		nav.to("https://www.wikipedia.com");
		nav.back();
		Thread.sleep(5000);
		nav.forward();
		Thread.sleep(5000);
		nav.refresh();
		
		
	}

}
