package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[contains(text(),'Open Menu')]")
	private WebElement OpenMenu;
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement LogoutBtn;
	
	public void clickOnOpenMenu()
	{
		OpenMenu.click();;
	}
	
	public void clickOnLogoutBtn()
	{
		LogoutBtn.click();
	}
}
