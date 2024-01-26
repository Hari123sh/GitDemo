import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		//or store 
		String title=driver.getTitle();
	    System.out.println(title);
		driver.getPageSource();
		
	
	}

}
