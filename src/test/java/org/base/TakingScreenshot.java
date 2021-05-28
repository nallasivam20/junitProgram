package org.base;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot {
	public static WebDriver driver;
	
	  @BeforeClass
	  public static void befoeClassMethod()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\JunitProgram\\Drivers\\chromedriver.exe");
          driver= new ChromeDriver();
          driver.get("https://www.facebook.com/");
          
	  }
	  
	  @AfterClass
	  public static void end()
	  {
		  driver.close();
	  }
	  
	  @Before
	  public void before1()
	  {
		  Date date = new Date();
		  System.out.println(date);
	  }
	  @After
	  public void afterMethod() throws IOException
	  {
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File screenshot = ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshot, new File("fb.png")); 
		 Date date = new Date();
		 
	  }
	  
	  @Test
	  public void t()
	  {
		  WebElement txtUserName = driver.findElement(By.name("email"));
		  WebElement txtPwd = driver.findElement(By.id("pass"));
		  txtUserName.sendKeys("nalla");
		  txtPwd.sendKeys("25633");
	  }
	  
	  
	  
	  
	  
	  
	  
	  
}
