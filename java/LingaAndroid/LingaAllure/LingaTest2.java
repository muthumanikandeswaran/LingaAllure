package LingaAndroid.LingaAllure;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.HardwareSettingsPage;
import Linga.pageObjects.OperationPage;
import Linga.pageObjects.OrderType;
import Linga.pageObjects.PinPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LingaTest2 extends LingaBase {


	@Test
	public void tryOne() throws InterruptedException, IOException {

		AndroidDriver<AndroidElement> dr1 = capabilities("cds");
		AndroidDriver<AndroidElement> dr = capabilities("apprelease");
		
		
		Utilities u = new Utilities(dr);
		u.storeLogin("shri1@mail.com","sri1234");

		Thread.sleep(5000);

		int c = dr.findElementsByClassName("android.view.View").size();    //39 / 43(pin 1 click) - pin page
		System.out.println(c);
		
		PinPage pp = new PinPage(dr);
		
		String str1 = pp.BusinessDate.getText();
		System.out.println(str1);
		Thread.sleep(2000);
		
		u.defaultPin();
		
		OrderType ot =new OrderType(dr);
		ot.Cancel.click();
		
		Thread.sleep(3000);
		
		DashboardPage dp = new DashboardPage(dr);
		dp.OperationInOrderScreen.click();
		OperationPage op = new OperationPage(dr);
		op.HardwareSettings.click();
		HardwareSettingsPage hsp = new HardwareSettingsPage(dr);
		hsp.CustomerDisplay.click();
		hsp.Disconnect.click();
		hsp.Connect.click();
		op.OperationList.click();
		op.POS.click();
		ot.Cancel.click();
		
		dr.findElementByXPath("//*[@text='NEW']").click();
		
		for(int i=0; i<20; i++)
		{
			dp.munch.click();
		}
		
		
		
		
		
		
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