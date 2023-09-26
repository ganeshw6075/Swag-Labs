package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import pageLayer.LoginPage;
import utilities.Util;

public class TestBase {
	
    public static WebDriver driver;
    public static Util util;
    public static LoginPage lp;
    public String br="chrome";
    @BeforeMethod
    public void setUp()
	{	
    	if(br.equalsIgnoreCase("chrome"))
    	{
    		driver=new ChromeDriver();
    	}
    	else if(br.equalsIgnoreCase("firefox"))
    	{
    		driver=new FirefoxDriver();
    	}
    	else if(br.equalsIgnoreCase("edge"))
    	{
    		driver=new EdgeDriver();
    	}
    	else
    	{
    		System.out.println("please enter valid browser");
    	}
    	
    	driver.get("https://www.saucedemo.com/v1/index.html");
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	
    	 lp=new LoginPage(driver);
    	 util=new Util();
	}
    
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }
}
