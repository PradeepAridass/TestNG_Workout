package com.tesng.annotation;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = -2)
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test(priority = 3)
	private void searchMobile() {
		System.out.println("Search Watch");
	}
	
	@Test(priority = 1)
	private void searchTv() {
		System.out.println("Search Tv");
	}
	
	@Test(priority = -2)
	private void searchHeater() {
		System.out.println("Serach Heater");
	}
	
	@Test(priority = 2)
	private void searchBag() {
		System.out.println("Search Bag");
	}
}
