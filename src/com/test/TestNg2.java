package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg2 {
   /* Sequence
    * @beforemethod
    * @test-1
    * @aftermethod
    * @beforemethod
    * @test-2
    * @aftermethod
    */
	
	
	//Pre-condition annotation-- starting with @Before
	
	@BeforeSuite // Frst methos execution
	public void setUp() {
	System.out.println("Setup system property for chrome");
	}
	
	@BeforeTest  // 2nd method
	public void launchBrowser() {
	System.out.println("Launch browser");
	}
	
	@BeforeClass // 3rd
	public void login() {
	System.out.println("Login to app");
	}
	
	@BeforeMethod  // 4th
	public void enterURL() {
	System.out.println("Enter url");
	}
	
	// Test Cases -- Starting with @Test
	
	@Test  // 5th
	public void googleTitleTest() {
	System.out.println("Google title test");
	}
	
	@Test  // 5th
	public void searchTest() {
	System.out.println("Search test");
	}
	
	// Post condition-- Starting with @after 
	
	@AfterMethod  // 6th
	public void logOut() {
	System.out.println("Logout from app");
	}
	
	@AfterClass  // 7th
	public void closeBrowser() {
	System.out.println("close browser");
	}
	
	@AfterTest  // 8th
	public void deleteAllCookies() {
	System.out.println("Delete all cookies");
	}
	

/*	@AfterSuite  // 8th
	public void generateTestReport() {
	System.out.println("Generate test report");
	} */
}


