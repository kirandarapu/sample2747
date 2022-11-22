package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="emailid")
	WebElement txtemail;
	
	@FindBy(name="passwd")
	WebElement txtpass;
	
	@FindBy(name="rememberme")
	WebElement clickcb;
	
	@FindBy(name="submitLogin")
	WebElement clickloginbtn;
	
	@FindBy(xpath="//ul/li[5][@class='backhover']/a")
	WebElement moveele;
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/ul/li[5]/ul/li[5]/div/div[1]/ul/li[8]/div/a")
	WebElement clicklogoutbtn;
	
	
	public void setEmail(String email) {
		
		
		txtemail.sendKeys(email);
	}
	
	public void setPassword(String pwd) {
		
		txtpass.sendKeys(pwd);
	}
	
	public void clickCheckbox() {
		clickcb.click();
	}
	public void clickloginbtn() {
		clickloginbtn.click();
	}
	
	public void clickLogoutbtn() throws InterruptedException {
		
	
		moveele.click();
		Thread.sleep(2000);
		
		
		clicklogoutbtn.click();
		System.out.println("the application is logged out");
	}

}
