package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class RegistrationPage extends BeforeAndAfter{
	
	private By oFirstname=By.xpath("//input[@id='firstName']");
	private By oTitle=By.xpath("//select[@id='title']");
	private By oGender=By.xpath("//select[@id='sex']");
	private By oMarriage=By.xpath("//select[@id='maritalStatus']");
	private By oUsername=By.xpath("//input[@id='username']");
	private By oEmail=By.xpath("//input[@id='email']");
	private By oPassword=By.xpath("//input[@id='password']");
	private By oRegister=By.xpath("//button[text()='Register']");
	private By oLogin = By.xpath("//a[text()='Login']");
	private WebDriver driver;
	private SeleniumWrapper oWrap;
	
	public RegistrationPage(WebDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}
	
	public boolean verifyElement() {
		if( oWrap.verifyDisplayedwithReturn(driver.findElement(oFirstname)) && oWrap.verifyDisplayedwithReturn(driver.findElement(oTitle))
				&& oWrap.verifyDisplayedwithReturn(driver.findElement(oGender)) && oWrap.verifyDisplayedwithReturn(driver.findElement(oMarriage)) 
				&& oWrap.verifyDisplayedwithReturn(driver.findElement(oUsername)) && oWrap.verifyDisplayedwithReturn(driver.findElement(oEmail))
				&& oWrap.verifyDisplayedwithReturn(driver.findElement(oRegister)) && oWrap.verifyDisplayedwithReturn(driver.findElement(oLogin))) {
			return true;
		}else {
			return false;
		}
	}
	
	public RegistrationPage enter_the_first_name(String firstname) {
		oWrap.type(driver.findElement(oFirstname), firstname);
		return this;
	}
	public RegistrationPage select_the_title(String sTitle) {
		oWrap.selectDropDownUsingVisibleText(driver.findElement(oTitle), sTitle);
		return this;
	}
	public RegistrationPage select_the_gender(String sGender) {
		oWrap.selectDropDownUsingVisibleText(driver.findElement(oGender), sGender);
		return this;
	}
	public RegistrationPage enter_the_marriage_status(String sMarriage) {
		oWrap.type(driver.findElement(oMarriage), sMarriage);
		return this;
	}
	public RegistrationPage enter_the_user_name(String username) {
		oWrap.type(driver.findElement(oUsername), username);
		return this;
	}
	public RegistrationPage enter_the_email(String email) {
		oWrap.type(driver.findElement(oEmail), email);
		return this;
	}
	public RegistrationPage enter_the_password(String password) {
		oWrap.type(driver.findElement(oPassword), password);
		return this;
	}	
	public EmailVerificationPage click_on_register_button() {
		oWrap.click(driver.findElement(oRegister));
		return new EmailVerificationPage(driver,node); 
	}	
	public LoginPage clickOnLogin() { 
		oWrap.click(driver.findElement(oLogin));
		return new LoginPage(driver,node);
	}
}
