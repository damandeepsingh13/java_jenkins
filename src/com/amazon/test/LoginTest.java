package com.amazon.test;

import org.testng.annotations.Test;

import com.amazon.main.Login;

public class LoginTest
{

	@Test
	public void testLogin()
	{
		System.out.println("Inside Test");
		Login login = new Login();
		login.login();
				
	}
}
