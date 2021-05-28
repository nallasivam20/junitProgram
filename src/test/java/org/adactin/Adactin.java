package org.adactin;

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
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	    public static WebDriver driver;
	    @BeforeClass
	    
	    public static void openUrl()
	    {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\JunitProgram\\Drivers\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.manage().window().maximize();
	    }
	    
	    @AfterClass
	    public static void end() throws InterruptedException, IOException
	    {
	    	Thread.sleep(6000);
	    	 TakesScreenshot ts = (TakesScreenshot) driver;
			  File screenshot = ts.getScreenshotAs(OutputType.FILE);
	   		 FileUtils.copyFile(screenshot, new File("fb.png")); 
  			    Date date = new Date();
  			    System.out.println(date);
			 
	    	driver.close();
	    }
	    
	    @Before
	    
	    	public void homePage()
	    	{
	    		driver.get("http://adactinhotelapp.com/");
	    		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='username']"));
	    		WebElement txtPwd = driver.findElement(By.name("password"));
	    		txtUsername.sendKeys("xavipik373");
	    		txtPwd.sendKeys("xavipik373");
	    		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
	    		btnLogin.click();
	    	}
	    
	    @Test
	    public void searchHotel() throws InterruptedException
	    {
	    	WebElement drdLocation = driver.findElement(By.name("location"));
	    	Select s = new Select(drdLocation);
	    	s.selectByVisibleText("Adelaide");
	    	Thread.sleep(3000);
	    	WebElement drdHotelName = driver.findElement(By.id("hotels"));
	    	Select s1 = new Select(drdHotelName);
	    	s1.selectByValue("Hotel Sunshine");
	    	Thread.sleep(3000);
	    	WebElement drdRoomType = driver.findElement(By.id("room_type"));
	    	Select s2 = new Select(drdRoomType);
	    	s2.selectByIndex(2);
	    	Thread.sleep(3000	);
	    	WebElement numberOfRooms = driver.findElement(By.name("room_nos"));
	    	Select s3 = new Select(numberOfRooms);
	    	s3.selectByValue("4");
	    	WebElement txtDateIn = driver.findElement(By.name("datepick_in"));
	    	txtDateIn.clear();
	    	txtDateIn.sendKeys("29/05/2021");
	    	Thread.sleep(2000);
	    	WebElement txtDateOut = driver.findElement(By.name("datepick_out"));
	    	txtDateOut.clear();
	    	txtDateOut.sendKeys("09/06/2021");
	    	Thread.sleep(3000);
	        WebElement drdAdultinRooms = driver.findElement(By.name("adult_room"));
	        Select s4 = new Select(drdAdultinRooms);
	        s4.selectByVisibleText("3 - Three");
	        Thread.sleep(3000);
	        WebElement drdChildinRoom = driver.findElement(By.name("child_room"));
	        Select s5 = new Select(drdChildinRoom);
	        s5.selectByVisibleText("1 - One");
	        Thread.sleep(3000);
	        WebElement btnSubmit = driver.findElement(By.xpath("//input[@name='Submit']"));
	        btnSubmit.click();
	        Thread.sleep(3000);
	        WebElement hotelSelect = driver.findElement(By.name("radiobutton_0"));
	        hotelSelect.click();
	        WebElement btnContinue = driver.findElement(By.name("continue"));
	        btnContinue.click();	    	
	    	    	
	    }
	    
	    @After
	    public  void paymentScreen() throws InterruptedException
	    {
	    	System.out.println("Payment Screen");
	    	WebElement txtFirstName = driver.findElement(By.name("first_name"));
	    	txtFirstName.sendKeys("nallasivam");
	    	WebElement txtLastName = driver.findElement(By.name("last_name"));
	    	txtLastName.sendKeys("Roobini");
	    	WebElement txtbillingAddress = driver.findElement(By.name("address"));
	    	txtbillingAddress.sendKeys("No.1, First floor , Anna salai,Chennai-600101");
	    	Thread.sleep(3000);
	    	WebElement txtCreditCardDetails = driver.findElement(By.name("cc_num"));
	    	txtCreditCardDetails.sendKeys("1234567891234567");
	    	Thread.sleep(3000);
	    	WebElement drdCreditCardName = driver.findElement(By.name("cc_type"));
            Select s = new Select(drdCreditCardName);
            s.selectByIndex(1);
            WebElement drdCreditCardExpiryMonth = driver.findElement(By.name("cc_exp_month"));
            Select s1 = new Select(drdCreditCardExpiryMonth);
            s1.selectByVisibleText("June");
            Thread.sleep(3000);
            WebElement drdExpiryYear = driver.findElement(By.name("cc_exp_year"));
            Select s2 = new Select(drdExpiryYear);
            s2.selectByValue("2022");
            Thread.sleep(3000);
            WebElement txtCvv = driver.findElement(By.name("cc_cvv"));
            txtCvv.sendKeys("585");
            Thread.sleep(3000);
            WebElement btnBookNow = driver.findElement(By.name("book_now"));
            btnBookNow.click();
	    	  		    	
	    }
	    
}
	    

