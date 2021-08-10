package pages;

import org.openqa.selenium.By;

import base.BeforeAndAfter;

public class HomePage extends BeforeAndAfter{
	
	private By oWelcome = By.xpath("//h3[contains(text(),' Welcome!')]");
	private By oLogout = By.xpath("//a[text()='Logout']");
	
	public HomePage verifyHomePage() {
		boolean result = driver.findElement(oWelcome).isDisplayed();
		if(result) {
			System.out.println("User Login is Successfull!!!");
		}else {
			System.out.println("User Login Failed!!!");
		}
		return this;
	}
	
	public LoginPage clickLogout() {
		driver.findElement(oLogout).click();
		return new LoginPage();
	}

}
