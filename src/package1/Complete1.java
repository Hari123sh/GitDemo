package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complete1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.chrome", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
		Point P=driver.manage().window().getPosition();
		int x=P.getX();
		int y=P.getY();
		System.out.println("X cordinate " + x);
		System.out.println("y cordinate " +y);
		Point updated=new Point(50,64);
		driver.manage().window().setPosition(updated);
		Thread.sleep(3000);
		Point newpo=driver.manage().window().getPosition();
		System.out.println("new x" +newpo.getX());
		System.out.println("new y " +newpo.getX());
		Thread.sleep(3000);
		Dimension dim=driver.manage().window().getSize();
		System.out.println("Height" + dim.getHeight());
		System.out.println("width" + dim.getWidth());
		Dimension d=new Dimension(65,85);
		System.out.println("xheck" + dim.getHeight());
		driver.manage().window().setSize(d);
		Thread.sleep(6000);
		Dimension newsi=driver.manage().window().getSize();
		System.out.println("new Height" + newsi.getHeight());
		System.out.println(" new width" + newsi.getWidth());
		driver.quit();
	}

}
