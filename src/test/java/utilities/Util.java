package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import testBase.TestBase;

public class Util extends TestBase{

	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void Takescreenshots(String name) throws Exception
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fin=ts.getScreenshotAs(OutputType.FILE);
		File fout=new File(System.getProperty("user.dir")+"//Screenshot//"+name+".png");
		FileHandler.copy(fin, fout);
	}
}
