package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class HomePage extends BeforeAndAfter{
	
	private By oWelcome = By.xpath("//h3[contains(text(),' Welcome!')]");
	private By oLogout = By.xpath("//a[text()='Logout']");
	private By oNewAccount = By.xpath("//div[text()='Apply For New Account']");
	private WebDriver driver;
	private SeleniumWrapper oWrap;
	
	public HomePage(WebDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}
	
	public HomePage verifyHomePage() {
		boolean result = oWrap.verifyDisplayedwithReturn(driver.findElement(oWelcome));
		if(result) {
			System.out.println("User Login is Successfull!!!");
		}else {
			System.out.println("User Login Failed!!!");
		}
		return this;
	}
	
	public LoginPage clickLogout() {
		oWrap.click(driver.findElement(oLogout));
		return new LoginPage(driver,node);
	}

	public NewAccountPage clickApplyForAccount() {
		driver.findElement(oNewAccount).click();
		return new NewAccountPage(driver, node);
	}

}
