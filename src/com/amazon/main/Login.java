package com.amazon.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amazon.common.Common;

public class Login 
{

	WebDriver driver;
	public void login()
	{			
		Common comm = new Common();
		driver = comm.getDriverInstance();
		driver.findElement(By.xpath("//*[@class='nav-line-1'][text()='Hello, Sign in']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();		
		
	}
}
