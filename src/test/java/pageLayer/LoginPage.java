package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginBtn;
	
	public void enterTxtUsername()
	{
		username.sendKeys("locked_out_user");
	}
	
	public void enterTxtPassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
}
