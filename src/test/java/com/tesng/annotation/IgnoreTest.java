package com.tesng.annotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	@Test(enabled = false)
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test
	private void searchMobile() {
		System.out.println("Search Watch");
	}
	
	@Test
	private void searchTv() {
		System.out.println("SearchTv");
	}
	
	@Ignore
	@Test
	private void searchHeater() {
		System.out.println("SerachHeater");
	}
	
	
	@Test
	private void searchBag() {
		System.out.println("Search Bag");
	}
	
}
