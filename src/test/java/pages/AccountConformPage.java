package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class AccountConformPage extends BeforeAndAfter {
	private By oView = By.xpath("//div[@id='viewAccounts']");
	private By oCon = By.xpath("(//h1[@class='text-center'])[1]");
	private WebDriver driver; // Global Variable
	private SeleniumWrapper oWrap;
		
	public AccountConformPage(WebDriver driver, ExtentTest node) {
			this.driver = driver;
			this.node = node;
		}
	public AccountConformPage verifyAccountConformPage() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean result = oWrap.verifyDisplayedwithReturn(driver.findElement(oCon));
		if(result) {
			System.out.println("User Create account Successfull!!!");
		}else {
			System.out.println("User Account creation Failed!!!");
		}
		return this;
	}
	
	public HomePage clickViewAccounts() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oWrap.click(driver.findElement(oView));
		return new HomePage(driver, node);
	}

}
