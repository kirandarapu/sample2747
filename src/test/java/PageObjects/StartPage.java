package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StartPage {
	
	WebDriver rdriver;
	
	public  StartPage(WebDriver ldriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/ul/li[2]/a/span[1]")
	WebElement lnkStart;
	
	@FindBy(id="acceptTerms")
	WebElement clkcbox;
	
	@FindBy(id="btnAdd")
	WebElement btnnxt;
	
	@FindBy(id="image")
	WebElement chooseimg;
	
	@FindBy(id="projectTitle")
	WebElement txtptitle;
	
	@FindBy(id="projectCategory")
	WebElement drppcate;
	
	@FindBy(id="shortBlurb")
	WebElement txtsblurb;
	
	@FindBy(id="projectLocation")
	WebElement txtlocat;
	
	@FindBy(id="duration_duration")
	WebElement clkrbtn;
	
	@FindBy(id="days")
	WebElement txtdays;
	
	@FindBy(id="duration_endtime")
	WebElement clkradionbtnend;
	
	@FindBy(name="Selecteddays")
	WebElement slctedate;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[6]/td/a[@class='ui-state-default']")
	WebElement txtdate;
	
	@FindBy(id="fundingGoal")
	WebElement txtfgoal;
	
	@FindBy(xpath="//input[@class='button-save b23']")
	WebElement btnnext;
	
	
	public void clickStart() {
		lnkStart.click();
	}
	public void clickCheckbox() {
		clkcbox.click();
	}
	public void clcickNextbtn() {
		btnnxt.click();
	}
	
	public void clickFImage() throws IOException {
		chooseimg.click();
		Runtime.getRuntime().exec("C:\\Users\\Home\\New.exe");
	}
	public void setProjectTitle(String title) {
		txtptitle.sendKeys(title);
	}
	
	public void setProjectCategory() {
		Select sc=new Select(drppcate);
		sc.selectByVisibleText("Fashion");
	}
	public void setShortblurb(String txt) {
		txtsblurb.sendKeys(txt);
	}
	
	public void setLocation(String loc) {
		txtlocat.sendKeys(loc);
	}
	public void clickRadiobtn() {
		clkrbtn.click();
	}
	public void setDays(int days) {
		txtdays.sendKeys(String.valueOf(days));
	}
	
	public void clickradiobtnEndDateAndTime() {
		clkradionbtnend.click();
	}
	public void setEndDateAndTime() {
		slctedate.click();
		txtdate.click();
		
	}
	public void setFundingGoal(String fgoal) {
		txtfgoal.sendKeys(fgoal);
	}
	public void clickendNextbtn() {
		btnnext.click();
	}
	
	
	
	

}
