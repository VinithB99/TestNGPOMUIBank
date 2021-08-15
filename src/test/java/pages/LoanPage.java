package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class LoanPage extends BeforeAndAfter {
	private By oApplyLoan = By.xpath("//button[text()='Apply For A Loan']");
	private By oEmail = By.xpath("//input[@id='email']");
	private By oRequestAmount = By.xpath("//input[@id='amount']");
	private By oTerm = By.xpath("//select[@id='term']");
	private By oIncome = By.xpath("//input[@id='income']");
	private By oAge = By.xpath("//input[@id='age']");
	private By oSubmit = By.xpath("//button[@id='submitButton']");
	private By oResult = By.xpath("(//div[@class='text-center'])[1]");
	private WebDriver driver;
	private SeleniumWrapper oWrap;
	
	public LoanPage(WebDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}
	public LoanPage clickApplyLoan() {
		oWrap.click(driver.findElement(oApplyLoan));
		return this;
	}
	public LoanPage enterEmail(String sEmail) {
		oWrap.type(driver.findElement(oEmail), sEmail);
		return this;
	}
	public LoanPage enterAmount(String sAmount) {
		oWrap.type(driver.findElement(oRequestAmount), sAmount);
		return this;
	}
	public LoanPage selectTerm(String sTerm) {
		oWrap.selectDropDownUsingVisibleText(driver.findElement(oTerm), sTerm);
		return this;
	}
	public LoanPage enterIncome(String sIncome) {
		oWrap.type(driver.findElement(oIncome), sIncome);
		return this;
	}
	public LoanPage enterAge(String sAge) {
		oWrap.type(driver.findElement(oAge), sAge);
		return this;
	}
	public LoanPage clickSubmitLoan() {
		oWrap.click(driver.findElement(oSubmit));
		return this;
	}
	public HomePage getResult() {
		oWrap.getText(driver.findElement(oResult));
		return new HomePage(driver,node);
	}
	
}
