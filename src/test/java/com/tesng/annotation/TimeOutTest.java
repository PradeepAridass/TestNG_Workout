package com.tesng.annotation;

import org.testng.annotations.Test;

public class TimeOutTest {

	@Test(timeOut = 5000)
	private void searchLaptop() throws InterruptedException {
		System.out.println("Search Laptop");
		Thread.sleep(1000);
	}
	
	@Test
	private void searchMobile() {
		System.out.println("Search Watch");
	}
	
	@Test(timeOut = 2000)
	private void searchTv() {
		System.out.println("SearchTv");
	}
	
	@Test
	private void searchHeater() {
		System.out.println("SerachHeater");
	}
	
	@Test
	private void searchBag() {
		System.out.println("Search Bag");
	}

}
