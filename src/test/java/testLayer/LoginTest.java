package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import testBase.TestBase;

public class LoginTest extends TestBase {
    @Test
	public void verifyLogin()
	{
		lp.enterTxtUsername();
		lp.enterTxtPassword();
		lp.clickLoginBtn();
		
		Assert.assertEquals(util.getPageTitle(),"Swag Labs");
	}
}
