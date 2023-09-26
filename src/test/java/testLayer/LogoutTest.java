package testLayer;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testBase.TestBase;
import utilities.TestListener;


public class LogoutTest extends TestBase {
 @Test(priority=2)
	public void VerifyLogout()
	{
		lp.enterTxtUsername();
		lp.enterTxtPassword();
		lp.clickLoginBtn();
		hp.clickOnOpenMenu();
		hp.clickOnLogoutBtn();
		
		Assert.assertEquals(util.getCurrentUrl(),"https://www.saucedemo.com/v1/index.html");
	}
}
