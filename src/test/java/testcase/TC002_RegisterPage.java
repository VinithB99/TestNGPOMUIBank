package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;
import pages.RegisterPage;

public class TC002_RegisterPage extends BeforeAndAfter {
	@Test(priority = 1)
	  public void verifyAlltheElements() {
		 boolean result = new LoginPage()
		 .clickRegisterAccount()
		 .verifyElement();
		  Assert.assertTrue(result);
		  new RegisterPage().clickOnLogin();
	  }
	@Test(priority = 2)
	public void clickRegisterLink() {
		new LoginPage().clickRegister();
	}
	@Test(priority = 3)
	public void registerUser() {
		new RegisterPage().typeFirstName("Ravi").selectTitle("Mr").selectGender("Male")
		.typeAge("20/11/1990").selectMarriage("Single").typeUsername("Ravi").typeEmail("ravi123@gmail.com")
		.typePassword("Ravi@123").clickRegisterbtn();
	}

}
