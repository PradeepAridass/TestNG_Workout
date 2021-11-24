package com.tesng.annotation;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups = "Electronics")
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test(groups = "Electronics")
	private void searchMobile() {
		System.out.println("Search Watch");
	}
	
	@Test(groups = "HomeAppliance")
	private void searchTv() {
		System.out.println("SearchTv");
	}
	
	@Test(groups = "HomeAppliance")
	private void searchHeater() {
		System.out.println("SerachHeater");
	}
	
	@Test
	private void searchBag() {
		System.out.println("Search Bag");
	}
}
