package Paytm.MobileAutomation.Testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Paytm.MobileAutomation.Pages.paytmLoginPage;
import Paytm.MobileAutomation.base.paytmBaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;



public class PaytmLoginTest extends paytmBaseClass{
	
	
	public PaytmLoginTest() throws Throwable {
		super();
		
	}



	
	@BeforeTest
	public void AppiumserStart() throws MalformedURLException, InterruptedException
	{
		AppiumCapabilities();
		
	}
	
	
	
	@Test
	public void Login() throws Throwable
	{
		paytmLoginPage paytmPage = new paytmLoginPage((AndroidDriver<WebElement>)driver);
				paytmPage.paytmlogin();
				
	}
	
	
	@AfterTest
	public void appiumserverStop()
	{
		System.out.println("AppiumServerStop");
		System.out.println("AppiumServerStopimmedialtely");
		
	}

}
