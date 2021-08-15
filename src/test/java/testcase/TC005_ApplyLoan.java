package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;

public class TC005_ApplyLoan extends BeforeAndAfter {
	@BeforeTest
	public void setUpTestCase() {
		authors = "vinith";
		category = "Regression";
		testCaseName = "Apply Loan";
		testDescription = "Testing the Apply Loan functionality";
		module = "Apply Loan Module";
	}

	
	
	@Test(priority = 1)
	public void transferAmount() {
		new LoginPage(driver, node)
	  	.typeUserName("vinith")
	  	.typePassword("Vinith@21")
	  	.clickSignIn()
	  	.clickApplyForLoan()
	  	.clickApplyLoan()
	  	.enterEmail("loan13@gmail.com")
	  	.enterAmount("100")
	  	.selectTerm("1")
	  	.enterIncome("1000")
	  	.enterAge("28")
	  	.clickSubmitLoan()
	  	.getResult()
	  	.clickLogout();
	}
	  	

}
