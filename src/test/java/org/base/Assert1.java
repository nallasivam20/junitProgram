package org.base;

import org.apache.commons.lang3.SystemUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Assert1 {

	@BeforeClass
	public static void b()
	{
		System.out.println("before");
	}
	
	@AfterClass
	public static void a()
	{
		System.out.println("After");
	}
	
	@Test
	 public void f()
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\JunitProgram\\Drivers\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 WebElement txtUserName = driver.findElement(By.name("email"));
		 txtUserName.sendKeys("nalla");
		 String attribute = txtUserName.getAttribute("value");
		 
		 Assert.assertEquals(attribute, "nalla");
		 	 
		 WebElement txtPwd = driver.findElement(By.name("pass"));
		 txtPwd.sendKeys("1234");
		 
		 System.out.println("After first break");
		 WebElement btnLogin = driver.findElement(By.name("login"));
		  boolean enabled = btnLogin.isEnabled();
		  if(enabled) {
			  btnLogin.click();
		  }
		  else
			  System.out.println("btn login not enable");
		 
		 
		 
	 }
	 
	
}
