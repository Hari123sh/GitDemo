package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetsetSizePosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","./drivers.chromedrivers.exe");
		ChromeDriver driver=new ChromeDriver();
		Point oldP=driver.manage().window().getPosition();
		int x1=oldP.getX();
		int y1=oldP.getY();
		System.out.println(x1);
		System.out.println(y1);
		Point newP=new Point(200,200);
		driver.manage().window().setPosition(newP);
		Point newPo=driver.manage().window().getPosition();
		int x2=newPo.getX();
		int y2=newPo.getY();
		System.out.println(x2);
		System.out.println(y2);
		driver.quit();
		ChromeDriver driver1=new ChromeDriver();
		Dimension oldS=driver1.manage().window().getSize();
		int W1=oldS.getWidth();
		int H1=oldS.getHeight();
		System.out.println(W1);
		System.out.println(H1);
		Dimension newS=new Dimension(1000,80);
		driver1.manage().window().setSize(newS);
		Dimension newS1=driver1.manage().window().getSize();
		int W2=newS1.getWidth();
		int H2=newS1.getHeight();
		System.out.println(W2);
		System.out.println(H2);
		driver1.quit();
		

	}

}
