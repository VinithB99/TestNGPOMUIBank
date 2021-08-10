package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BeforeAndAfter;

public class RegisterPage extends BeforeAndAfter {
	private By oFirstname=By.xpath("//input[@id='firstName']");
	private By oTitle=By.xpath("//select[@id='title']");
	private By oGender=By.xpath("//select[@id='sex']");
	private By oAge=By.xpath("//input[@id='age']");
	private By oMarriage=By.xpath("//select[@id='maritalStatus']");
	private By oUsername=By.xpath("//input[@id='username']");
	private By oEmail=By.xpath("//input[@id='email']");
	private By oPassword=By.xpath("//input[@id='password']");
	private By oRegisterbtn=By.xpath("//button[text()='Register']");
	private By oLogin = By.xpath("//a[text()='Login']");
	
	public boolean verifyElement() {
		if( driver.findElement(oFirstname).isDisplayed() && driver.findElement(oTitle).isDisplayed() 
		        && driver.findElement(oGender).isDisplayed() && driver.findElement(oAge).isDisplayed()
		        && driver.findElement(oMarriage).isDisplayed() && driver.findElement(oUsername).isDisplayed() 
		        && driver.findElement(oEmail).isDisplayed() && driver.findElement(oPassword).isDisplayed() 
		        && driver.findElement(oRegisterbtn).isDisplayed()) {
			return true;			
		}else {
			return false;
		}
	}
	public RegisterPage typeFirstName(String sFirstname) {
		driver.findElement(oFirstname).sendKeys(sFirstname);
		return this;
	}
	public RegisterPage selectTitle(String sTitle) {
		WebElement title;
		title=driver.findElement(oTitle);
		Select selTitle=new Select(title);
		selTitle.selectByVisibleText(sTitle);
		return this;
	}
	public RegisterPage selectGender(String sGender) {
		WebElement sex;
		sex=driver.findElement(oGender);
		Select selSex=new Select(sex);
		selSex.selectByVisibleText(sGender);
		return this;
	}
	public RegisterPage typeAge(String sAge) {
		driver.findElement(oAge).sendKeys(sAge);
		return this;
	}
	public RegisterPage selectMarriage(String sMarriage) {
		WebElement mar;
		mar=driver.findElement(oMarriage);
		Select selMar=new Select(mar);
		selMar.selectByVisibleText(sMarriage);
		return this;
	}
	public RegisterPage typeUsername(String sUsername) {
		driver.findElement(oUsername).sendKeys(sUsername);
		return this;
	}
	public RegisterPage typeEmail(String sEmail) {
		driver.findElement(oEmail).sendKeys(sEmail);
		return this;
	}
	public RegisterPage typePassword(String sPassword) {
		driver.findElement(oPassword).sendKeys(sPassword);
		return this;
	}
	public LoginPage clickRegisterbtn() {
		driver.findElement(oRegisterbtn).click();;
		return new LoginPage();
	}
	public LoginPage clickOnLogin() { 
		driver.findElement(oLogin).click();
		return new LoginPage();
	}

}
