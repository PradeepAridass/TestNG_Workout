package com.tesng.annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {

	@BeforeTest
	public void setUp() {
		System.out.println("signin");
	}
	
	@BeforeTest
	public void browserLaunch() {
		System.out.println("BrowserLaunch"); 
		
	}
	
	@org.testng.annotations.BeforeClass
	private void url() {
		System.out.println("URL");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("Login");
	}
	
	@Test
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test
	private void searchMobile() {
		System.out.println("Search Watch");
	}
	
	@Test
	private void searchBag() {
		System.out.println("Search Bag");
	}
	
	@AfterMethod
	private void verifyPage() {
		System.out.println("Verify HomePage");
	}
	
	@AfterClass
	private void logout() {
		System.out.println("Logout");
	}
	
	@AfterTest
	private void browserClose() {
		System.out.println("Browser Close");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}
	
}

