package testcase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.BeforeAndAfter;
import pages.LoginPage;

public class TC003_CreateAccount extends BeforeAndAfter {
	@BeforeTest
	public void setUpTestCase() {
		authors = "vinith";
		category = "Regression";
		testCaseName = "Create Account";
		testDescription = "Testing the Create Account functionality";
		module = "Create Account Module";
	}

	
	
	@Test(priority = 1)
	public void createNewAccount() {
		  new LoginPage(driver, node)
		  	.typeUserName("vinith")
		  	.typePassword("Vinith@21")
		  	.clickSignIn()
		  	.clickApplyForAccount()
		  	.typeNickName("vinith123")
		  	.selectAccountType("Savings")
		  	.applyToCreateAccount()
		  	.clickViewAccounts()
		  	.clickLogout();
		  			  
	  }
	
}
