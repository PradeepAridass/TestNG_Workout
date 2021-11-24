package com.tesng.annotation;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters({"username","password"})
	private void logIn(@Optional("Sanjeev")String uname, String passwrd) {
		System.out.println("Enter your Login Details:");
		System.out.println("Username: "+uname);
		System.out.println("Password: "+passwrd);
	}
}

