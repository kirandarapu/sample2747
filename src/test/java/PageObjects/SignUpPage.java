package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage   {
	
	WebDriver ldriver;
	public SignUpPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="user_name")
	WebElement txtuser;
	
	@FindBy(id="user_email1")
	WebElement txtemail;
	
	@FindBy(id="user_password1")
	WebElement txtpass;
	
	@FindBy(id="user_password_confirmation")
	WebElement txtcpass;
	
	
	
	@FindBy(name="submitSignup")
	WebElement btnsignup;
	
	public void setName(String name) {
		txtuser.sendKeys(name);
	}
	public void setEmailid(String mail) {
		txtemail.sendKeys(mail);
	}
	public void setPasswords(String passwd) {
		txtpass.sendKeys(passwd);
	}
	public void setConfirmpass(String cpassw) {
		txtcpass.sendKeys(cpassw);
	}
	
	
	public void clickSignupbtn() {
		btnsignup.click();
	}

}
