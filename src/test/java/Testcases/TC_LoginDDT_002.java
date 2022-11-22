package Testcases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {

	@Test(dataProvider="LOGINDATA2747")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(user);
		Thread.sleep(3000);
		logger.info("user name provided");
		lp.setPassword(pwd);
		Thread.sleep(3000);
		logger.info("password provided");
		lp.clickloginbtn();

		Thread.sleep(3000);

		/*	if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}*/
		/*		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickLogoutbtn();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();

		}


	}*/


		/*	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}*/

	}


		@DataProvider(name="LOGINDATA2747")
		String [][] getData() throws IOException
		{
			String path=System.getProperty("user.dir")+"/src/test/java/TestData/LOGINDATA2747.xlsx";

			int rownum=XLUtils.getRowCount(path, "Sheet1");
			int colcount=XLUtils.getCellCount(path,"Sheet1",1);

			String logindata[][]=new String[rownum][colcount];

			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)
				{
					logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
				}

			}
			return logindata;
		}
	}
