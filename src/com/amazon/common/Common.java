package com.amazon.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common 
{
	WebDriver driver;
	public WebDriver getDriverInstance()
	{
		System.setProperty("webdriver.chrome.driver", "Util\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in");
		return driver;	 
	}

}
