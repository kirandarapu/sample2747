package Testcases;

import java.io.IOException;
import java.lang.System.Logger;

import org.junit.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.StartPage;

public class TC_StartTest_004 extends BaseClass {


	LoginPage lp;
	@Test
	public 	void starttest() throws IOException, InterruptedException{

		lp=new LoginPage(LoginPage);	  
		lp.setEmail(Email);
		Thread.sleep(1000);
		lp.setPassword(Password);
		Thread.sleep(1000);
		lp.clickCheckbox();
		Thread.sleep(1000);
		lp.clickloginbtn();
		Thread.sleep(3000);

		StartPage stp=new StartPage(driver);
		stp.clickStart();
		Thread.sleep(2000);
		logger.info("the start button is clicked");
		stp.clickCheckbox();
		logger.info("the checkbox is clicked");
		Thread.sleep(1000);
		stp.clcickNextbtn();
		logger.info("the Next button is clicked");
		Thread.sleep(1000);
		stp.clickFImage();
		logger.info("the image is selected");
		Thread.sleep(1000);
		stp.setProjectTitle("Fundraising Project");
		logger.info("the project title is enterd");
		Thread.sleep(1000);
		stp.setProjectCategory();
		logger.info("the project category is selected");
		Thread.sleep(1000);
		stp.setShortblurb("this is the ultimate project for raising fund for own kick starting website");
		logger.info("the Short blurb is entered");
		Thread.sleep(1000);
		stp.setLocation("Hyderabad");
		logger.info("the location is enterd");
		Thread.sleep(1000);
		stp.setDays(30);
		logger.info("the no of days is entered");
		Thread.sleep(1000);
		stp.setEndDateAndTime();
		logger.info("the end date and time is selected");
		Thread.sleep(2000);
		stp.setFundingGoal("The ultimate goal of this project is don't depending on others ,they will put their own efforts and earning funds");
		logger.info("the the funding goal is entered");
		Thread.sleep(1000);
		stp.clickendNextbtn();
		
		boolean res=driver.getPageSource().contains("My profile : Fundraiser");
		
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("testcase is passed");
		}else
			
		{
			logger.info("testcase is failed");
			captureScreen(driver,"StartTest");
			Assert.assertTrue(false);
		}

	}

}
