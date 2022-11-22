 package Testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Parameters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import utilities.ReadConfig;

public class BaseClass {

	ReadConfig rc=new ReadConfig();
	
	public String BaseURL=rc.getApplicationURL();
	public String Email=rc.getEmail();
	public String Password=rc.getPassword();
	public String Name=rc.getName();
	public String Emailids=rc.getEmailid();
	public String Passwords=rc.getPasswords();
	public String CPasswords=rc.getCpasswords();
	
	                                                                                                                                                                                                                                                
	public static WebDriver driver;
	 
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{			
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",rc.getChromePath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", rc.getFirefoxpath());
			driver=new FirefoxDriver();
		}
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", rc.getIEPath());
			driver=new InternetExplorerDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(BaseURL);
	
		
		
		
		logger=Logger.getLogger("Fundraiser");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver,String tname) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screensht is taken");
	}
	
}
