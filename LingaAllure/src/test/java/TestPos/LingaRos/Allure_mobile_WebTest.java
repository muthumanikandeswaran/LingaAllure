package TestPos.LingaRos;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.HardwareSettingsPage;
import Linga.pageObjects.OperationPage;
import Linga.pageObjects.OrderType;
import Linga.pageObjects.PinPage;
import Linga.pageObjects.TableLayoutPage;
import LingaAndroid.LingaAllure.LingaBase;
import LingaAndroid.LingaAllure.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Allure_mobile_WebTest extends LingaBase {



	@Test
	public void tryOne() throws InterruptedException, IOException {


		AndroidDriver<AndroidElement> dr = Capabilities();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Utilities u = new Utilities(dr);
		u.storeLogin("shri1@mail.com","sri1234");
		Thread.sleep(5000);
		PinPage pp = new PinPage(dr);
		u.defaultPin();
		OrderType ot =new OrderType(dr);
		ot.Cancel.click();

		
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid", "618431f4");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

		AndroidDriver<AndroidElement> dr1 = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		dr1.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		dr1.startActivity(new Activity("com.benseron.pos", "com.benseron.pos.MainActivity"));
		u.storeLogin("shri1@mail.com","sri1234");
		Thread.sleep(5000);
		u.defaultPin();
		ot.Cancel.click();

		
		
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");                                        //1    //2(a space after comma is not allowed)  //3 (small -webdriver)
		WebDriver dr2 = new ChromeDriver();     
		dr2.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);                                                                                                                     //4       (chromed(no)Driver)
		dr2.manage().window().maximize();

		dr2.get("http://web.lingapos.com");    
		
		
		
		
		
		
		
		//int d = dr.findElementsByClassName("android.view.View").size();   //   orderscreen   78
		//System.out.println(d);


		//DashboardPage dp = new DashboardPage(dr);
		//dp.CustomerAdd.click();
		//dp.CustomerListsearch.sendKeys("shri");
		//dp.CustomerNameDisplay.click();
		//dp.EnterNameWalkInCustomer.sendKeys("Meenatchi");
		//dp.Ok.click();
		//dp.CustomerNameDisplay.click();

		//dp.Close.click();
		//dp.AddSeats.click();
		//dp.SeatsDisplayDropdownButton.click();
		//Thread.sleep(3000);
		//dp.SeatsDisplayDropdownButton.click();
		//int dd = dr.findElementsByClassName("android.view.View").size();   //   order screen after a change - small    80
		//System.out.println(dd);
		//Thread.sleep(3000);
		//int ddd = dr.findElementsByClassName("android.widget.Spinner").size();   //   orderscreen    3
		//System.out.println(ddd);

		//String st = dp.CheckNumber.getText();
		//System.out.println(st);

		//dp.ServiceTypesDropdown.click();

		//dp.FirstSeat.click();
		//dp.TableSelection.click();

		//dp.CategoryDropdown.click();
		//dp.CategoryDropdown.click();


	}

}