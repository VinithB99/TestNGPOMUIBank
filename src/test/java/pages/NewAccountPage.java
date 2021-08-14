package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;
import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class NewAccountPage extends BeforeAndAfter{
	private By oView = By.xpath("//div[@id='viewAccounts']");
	private By oNickName = By.xpath("//input[@id='accountNickname']");
	private By oAccountType = By.xpath("//select[@id='typeOfAccount']");
	private By oApply = By.xpath("//button[@class='btn text-center btn-blue-outline form-button btn-xl']");
	private WebDriver driver; // Global Variable
	private SeleniumWrapper oWrap;
	
	public NewAccountPage(WebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}
	
	public boolean verifyNewAccountPageElement() {
		if( oWrap.verifyDisplayedwithReturn(driver.findElement(oNickName)) && oWrap.verifyDisplayedwithReturn(driver.findElement(oAccountType))
				&& oWrap.verifyDisplayedwithReturn(driver.findElement(oApply))) {
			return true;			
		}else {
			return false;
		}
	}
	public NewAccountPage typeNickName(String sNickName) {
		oWrap.type(driver.findElement(oNickName), sNickName);
		return this;
	}
	public NewAccountPage selectAccountType(String sAccountType) {
		
		oWrap.selectDropDownUsingVisibleText(driver.findElement(oAccountType), sAccountType);
		return this;
	}
	public NewAccountPage applyToCreateAccount() {
		oWrap.click(driver.findElement(oApply));
		return this;
	}
	public HomePage clickViewAccounts() {
		oWrap.click(driver.findElement(oView));
		return new HomePage(driver, node);
	}

}
