package Testcases;

import org.testng.annotations.Test;

import PageObjects.SignUpPage;

public class TC_SignUp_003 extends BaseClass{
	
	SignUpPage sp;
	@Test
	public void signuptest() throws InterruptedException {
		
		sp=new SignUpPage(driver);
		Thread.sleep(1000);
		sp.setName(Name);
		logger.info("the neme is entered");
		Thread.sleep(1000);
		sp.setEmailid(Emailids);
		logger.info("the emeil is entered");
		Thread.sleep(1000);
		sp.setPasswords(Passwords);
		logger.info("the password is entered");
		Thread.sleep(1000);
		
		sp.setConfirmpass(CPasswords);
		logger.info("the confirm password is entered");
		Thread.sleep(10000);
		
		sp.clickSignupbtn();
		logger.info("the signup button is clicked");
		Thread.sleep(1000);
		logger.info("registered successfully check your mail and activate your account ");
		
		
	}
	
}
