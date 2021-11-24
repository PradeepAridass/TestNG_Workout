package com.tesng.annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "logInData")
	private void login(String uname, String passwrd) {
		System.out.println("Enter the loginDetails:");
		System.out.println("Username: "+uname);
		System.out.println("Password: "+passwrd);
			
	}

	@DataProvider
	private Object[][] logInData() {
		return new Object[][] {
			{"AAA", "111"},
			{"BBB", "222"},
			{"CCC", "333"},
		};
		
	}
	
}
