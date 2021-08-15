package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class TransferPage extends BeforeAndAfter {
	private By oFromAcc = By.xpath("//select[@id='fromAccount']");
	private By oToAcc = By.xpath("//select[@id='toAccount']");
	private By oAmount =By.xpath("//input[@id='amountTransferred']");
	private By oReview =By.xpath("//button[@class='btn btn-blue-outline btn-xl form-button']");
	private By oConform =By.xpath("//button[@class='btn btn-primary']");
	private By oTextConform =By.xpath("//h1[@class='text-center']");
	private WebDriver driver;
	private SeleniumWrapper oWrap;
	//button[@class='btn btn-primary']
	public TransferPage(WebDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}
	public TransferPage fromAccount() {
		oWrap.selectDropDownUsingIndex(driver.findElement(oFromAcc),1);
		return this;
	}
	public TransferPage toAccount() {
		oWrap.selectDropDownUsingIndex(driver.findElement(oToAcc),2);
		return this;
	}
	public TransferPage enterAmount(String sAmount) {
		oWrap.type(driver.findElement(oAmount),sAmount);
		return this;
	}
	public TransferPage clickReview() {
		oWrap.click(driver.findElement(oReview));
		return this;
	}
	public TransferPage clickConform() {
		oWrap.click(driver.findElement(oConform));
		return this;
	}
	public HomePage afterTransfer() {
		oWrap.getText(driver.findElement(oTextConform));
		return new HomePage(driver,node);
		
	}

}
