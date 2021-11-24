package com.tesng.annotation;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test(expectedExceptions = Exception.class)
	private void test1() {
		System.out.println(10/0);
	}

}
