package com.tesng.annotation;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 2)
	private void searchLaptop() {
		System.out.println("Search Laptop");
	}
	
	@Test(invocationCount = 2)
	private void searchMobile() {
		System.out.println("Search Mobile");
	}
	
	@Test(invocationCount = 3)
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
