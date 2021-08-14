package testcase;


import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;
import pages.RegistrationPage;

public class TC002_RegistrationPage extends BeforeAndAfter{

	@BeforeTest
	public void setUpTestCase() {
		sSheetName = "TC002";
		authors = "Vinith";
		category = "Regression";
		testCaseName = "Registration";
		testDescription = "Testing the Registration functionality";
		module = "Registration Module";
	}
	
  @Test(priority = 1)
  public void verifyAlltheElements() {
	 boolean result = new LoginPage(driver,node)
	 .clickRegisterAccount()
	 .verifyElement();
	  Assert.assertTrue(result);
	  new RegistrationPage(driver,node).clickOnLogin();
  }

  @Test(priority = 2,dataProvider = "ExcelData")
  public void registerWithMandatoryFields(String fName,String title,String gender,String marriage,String uName,String email,String password) {
	  new LoginPage(driver,node)
	 .clickRegisterAccount()
	 .enter_the_first_name(fName)
	 .select_the_title(title)
	 .select_the_gender(gender)
	 .enter_the_user_name(uName+randomNumGen())
	 .enter_the_email(email+randomNumGen()+"@credo.com")
	 .enter_the_password(password)
	 .click_on_register_button()
	 .verifyUserRegistration()
	 .clickOnLogin();
	 
  }
  
  public int randomNumGen() {
	  Random ran = new Random();
	  return ran.nextInt(10000);
  }
  
  
}
