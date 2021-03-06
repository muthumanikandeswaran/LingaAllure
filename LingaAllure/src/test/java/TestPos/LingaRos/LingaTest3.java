package TestPos.LingaRos;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class LingaTest3 extends LingaBase {


	@SuppressWarnings("null")
	@Test
	public void tryOne() throws InterruptedException, IOException {


		//AndroidDriver<AndroidElement> dr = capabilities("apprelease");

		


		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

		AndroidDriver<AndroidElement> dr = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		dr.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		dr.startActivity(new Activity("com.benseron.pos", "com.benseron.pos.MainActivity"));


		Utilities u = new Utilities(dr);
		//u.storeLogin("shri1@mail.com","sri1234");

		Thread.sleep(5000);


		PinPage pp = new PinPage(dr);


		//Thread.sleep(2000);

		u.defaultPin();

		OrderType ot =new OrderType(dr);

		ot.Cancel.click();
		DashboardPage dp = new DashboardPage(dr);
		dp.All.click();
		CheckStatusPage csp = new CheckStatusPage(dr);
		csp.Tablelayout.click();
		TableLayoutPage tlp = new TableLayoutPage(dr);
		//Thread.sleep(3000);
		tlp.NewCheck.click();
		tlp.Table6.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Finish.click();
		tlp.NewCheck.click();
		//Thread.sleep(3000);
		tlp.Table6.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Finish.click();
		tlp.NewCheck.click();
		//Thread.sleep(3000);
		tlp.Table6.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Finish.click();
		tlp.NewCheck.click();
		//Thread.sleep(3000);
		tlp.Table6.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Finish.click();
		tlp.NewCheck.click();
		//Thread.sleep(3000);
		tlp.Table6.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Finish.click();
		csp.Logout.click();

		((AppiumDriver<AndroidElement>)dr).closeApp();

		dr.startActivity(new Activity("com.benseron.pos", "com.benseron.pos.MainActivity"));

		u.defaultPin();

		ot.Cancel.click();

		dp.ServiceTypesDropdown.click();
		dp.DINEINService.click();
		Thread.sleep(3000);
		tlp.Table6.click();
		dp.munch.click();
		dp.Finish.click();

		tlp.NewCheck.click();
		//Thread.sleep(3000);
		tlp.Table6.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Finish.click();
		tlp.NewCheck.click();
		//Thread.sleep(3000);
		tlp.Table6.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Finish.click();
		csp.QSR.click();
		dp.All.click();
		tlp.Table6.click();

		OperationPage op = new OperationPage(dr);

		HardwareSettingsPage hsp = new HardwareSettingsPage(dr);









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