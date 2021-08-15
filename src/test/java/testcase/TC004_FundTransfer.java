package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;

public class TC004_FundTransfer extends BeforeAndAfter {
	@BeforeTest
	public void setUpTestCase() {
		authors = "vinith";
		category = "Regression";
		testCaseName = "Fund Transfer";
		testDescription = "Testing the Fund Transfer functionality";
		module = "Fund Transfer Module";
	}

	
	
	@Test(priority = 1)
	public void transferAmount() {
		new LoginPage(driver, node)
	  	.typeUserName("vinith")
	  	.typePassword("Vinith@21")
	  	.clickSignIn()
	  	.clickTransfer()
	  	.fromAccount()
	  	.toAccount()
	  	.enterAmount("10")
	  	.clickReview()
	  	.clickConform()
	  	.afterTransfer()
	  	.clickLogout();
	
	}


}
