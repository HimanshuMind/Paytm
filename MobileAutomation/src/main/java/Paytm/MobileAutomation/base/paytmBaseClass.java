package Paytm.MobileAutomation.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class paytmBaseClass {
	
	public  AppiumDriver driver;
	
public 	paytmBaseClass() throws Throwable {
    Properties 	prop = new Properties();
	FileInputStream ip = new FileInputStream("C:\\Users\\himanshuagrawal\\Desktop\\Moibile Automation\\MobileAutomation\\src\\main\\java\\Paytm\\MobileAutomation\\config\\paytmconfig.properties");
	prop.load(ip);
}



	public void AppiumCapabilities () throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("platformVersion", "5.0.0");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("deviceName", "Micromax Q380");
		 cap.setCapability("udid", "0123456789ABCDEF");
		 cap.setCapability("appPackage", "net.one97.paytm");
		 cap.setCapability("appActivity", "net.one97.paytm.landingpage.activity.AJRMainActivity");
		 cap.setCapability("FullReset", "true");
		  URL apppiumurl = new URL("http://127.0.0.1:4723/wd/hub");
		  driver = new AndroidDriver<MobileElement>(apppiumurl,cap);
		  Thread.sleep(2000);
	     // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")).click();
		 
	}

}
