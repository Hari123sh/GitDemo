package package1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppVer {
	
	static String zoomCurrentVersion="Version 5.12.8 (10232) (64-bit)";
	static String zoomLatestVersion;
	static Boolean zoomUpdateStatus;
	static String teamsCurrentVersion="1.6.00.18681";
	static String teamsLatestVersion;
	static Boolean teamsUpdateStatus;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		zoomUpdateStatus=zoomVersionCheck();
		teamsUpdateStatus=teamsVersionCheck();
	}
	public static Boolean zoomVersionCheck() throws InterruptedException {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/mm/dd h:mm:ss a");
		LocalDateTime now=LocalDateTime.now();
		
		System.setProperty("webdriver.chromedriver", "./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://zoom.us/download#client_4meeting");
		Thread.sleep(5000);
		zoomLatestVersion=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[1]/div/div[4]/span")).getText();
		System.out.println(zoomCurrentVersion);
		System.out.println(zoomLatestVersion);
		if(zoomLatestVersion.equals(zoomCurrentVersion))
		{
			System.out.println("Zoom version not updated and updated version is " + zoomLatestVersion);
			driver.quit();
			return true;
		}
		else
		{
			System.out.println("Zoom version updated and updated version is " + zoomLatestVersion);
			driver.quit();
			return false;
			
		}
		
		
	}
	public static boolean teamsVersionCheck() throws InterruptedException {
		System.setProperty("webdriver.chromdriver","./drivers.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://microsoft-teams.updatestar.com/en");
		//Thread.sleep(5000);
		//String ver=driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[24]/table/tbody/tr[1]/td[3]")).getText();
		driver.get("https://microsoft-teams.updatestar.com/en");
		Thread.sleep(5000);
		String ver1=driver.findElement(By.xpath("\"https://microsoft-teams.updatestar.com/en\"")).getText();
		driver.get("https://microsoft-teams.en.uptodown.com/windows/versions");
		String ver2=driver.findElement(By.xpath("//div[@class='version']")).getText();
		//System.out.println(ver);
		System.out.println(ver1);
		System.out.println(ver2);
		return true;
	}

}
