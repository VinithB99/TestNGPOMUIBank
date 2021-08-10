package testcase;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;

public class TC001_LoginPage extends BeforeAndAfter{
	
  @Test(priority = 1)
  public void verifyAlltheElements() {
	  boolean result = new LoginPage().verifyElement();
	  Assert.assertTrue(result);
  }

  @Test(priority = 2)
  public void loginwithValidCredential() {
	  new LoginPage()
	  	  .typeUserName("vinith")
	  	  .typePassword("Vinith@21")
	  	  .clickSignIn()
	  	  .verifyHomePage()
	  	  .clickLogout();
  }
  
  
  @Test(priority = 3)
  public void loginWithInValidCredential() {
	  new LoginPage()
	  	  .typeUserName("vinith")
	  	  .typePassword("Vinith21")
	  	  .clickSignIn_InvalidDetails();
	  
  }
}
