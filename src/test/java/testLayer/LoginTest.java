package testLayer;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testBase.TestBase;
import utilities.TestListener;


public class LoginTest extends TestBase {
    @Test(priority=1)
	public void verifyLogin()
	{
		lp.enterTxtUsername();
		lp.enterTxtPassword();
		lp.clickLoginBtn();
		
		Assert.assertEquals(util.getPageTitle(),"Swag Labs");
	}
}
