package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	
	 public LoginPage lp;
	 
	 @Test
	public void logintest() throws InterruptedException, IOException {
		
		driver.get(BaseURL); 
		logger.info("the url is opened");
		Thread.sleep(3000);
		lp=new LoginPage(driver);
		
		lp.setEmail(Email);
		logger.info("the email is entered");
		Thread.sleep(3000);
		lp.setPassword(Password);
		logger.info("the password is entered");
		Thread.sleep(3000);
		lp.clickCheckbox();
		logger.info("the check box is clicked");
		Thread.sleep(3000);
		lp.clickloginbtn();
		logger.info("clicked login btn");
		
		
		if(driver.getTitle().equals("My profile : Fundraiser1234")) {
			
			Assert.assertTrue(true);
			logger.info("the testcase is passed");
		//	System.out.println("the test case is passed");
		}else
		{
			captureScreen(driver,"loginTEST");
			
			Assert.assertTrue(false);
			logger.info("login test failed");
		}
		lp.clickLogoutbtn();
		logger.info("the application is closed");
	}
}
