package TestPos.LingaRos;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.OperationPage;
import Linga.pageObjects.OrderType;
import LingaAndroid.LingaAllure.LingaBase;
import LingaAndroid.LingaAllure.Utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LingaTest1 extends LingaBase {


	@Test
	public void tryOne() throws InterruptedException, IOException {

		AndroidDriver<AndroidElement> dr = Capabilities();

		Utilities u = new Utilities(dr);
		u.storeLogin("shri1@mail.com","sri1234");

		Thread.sleep(10000);

		u.defaultPin();

		OrderType ot =new OrderType(dr);
		ot.Cancel.click();

		Thread.sleep(3000);
		DashboardPage dp = new DashboardPage(dr);
		dp.OperationList.click();

		OperationPage op = new OperationPage(dr);
		op.SyncBackOffice.click();
		Thread.sleep(4000);
		dp.OperationList.click();

		op.POS.click();

		ot.Cancel.click();

		dp.All.click();

		//passed		


		Thread.sleep(2000);
		CheckStatusPage csp = new CheckStatusPage(dr);
		//int c = dr.findElementsByClassName("android.view.View").size();
		//System.out.println(c);
		csp.QSR.click();
		ot.Cancel.click();
		dp.All.click();
		Thread.sleep(2000);

		csp.Checksync.click();
		Thread.sleep(4000);

		Thread.sleep(2000);
		csp.Logout.click();


		u.defaultPin();
		ot.Cancel.click();
		dp.All.click();
		Thread.sleep(2000);


		int c = dr.findElementsByClassName("android.view.View").size();
		System.out.println(c);
		u.verifyLoginUser();








		
		// int c = dr.findElementsByClassName("android.widget.Button").size();
		// System.out.println(c);

		// dr.findElementByXPath("(//android.widget.Button)[1]").click();


		//dr.findElementByAndroidUIAutomator("text(\"Cancel\")").click();
		//dr.findElementByXPath("//android.widget.Button[@text='Cancel']").click();


		/*
		  dr.findElementByXPath("//android.view.View[@text='QSR ']").click();
		  dr.findElementByXPath("//android.widget.Button[@text='DINE IN']").click();

		 * dr.findElementByXPath("//android.widget.Button[@text='T9']").click();
		 * dr.findElementByXPath("//android.widget.Button[@text='new menu']").click();
		 * dr.findElementByXPath("//android.widget.Button[@text='Finish']").click();
		 * Thread.sleep(8000);
		 * dr.findElementByXPath("(//android.view.View)[7]").click();
		 * Thread.sleep(3000);
		 * 
		   int c = dr.findElementsByClassName("android.widget.TextView").size();     //returns 17
		 * System.out.println(c);
		 *  
		 * dr.findElementByXPath("(//android.widget.TextView)[16]").click();    //assumed 17  would be name text,hence placing LOGOUT button at 16, checksync-15
		 * 
		 * //dr.findElementByXPath("//android.view.MenuItem[@text='QSR']").click();
		 * //dr.findElementByAndroidUIAutomator("text(\"Cancel\")").click();
		 * 
		 * dr.findElementByXPath("//*[@text='Log Out']").click();
		 * dr.findElementByXPath("//*[@text='Yes']").click();
		 * 
		 * dr.findElementByXPath("//*[@text='1']").click();
		 * dr.findElementByXPath("//*[@text='2']").click();
		 * dr.findElementByXPath("//*[@text='3']").click();
		 * dr.findElementByXPath("//*[@text='4']").click();
		 * dr.findElementByXPath("//*[@text='Continue']").click(); Thread.sleep(5000);
		 * ((AppiumDriver<AndroidElement>)dr).resetApp();
		 * dr.findElementByXPath("//android.widget.EditText[@resource-id='mat-input-0']"
		 * ).sendKeys("shri1@mail.com");
		 * dr.findElementByXPath("//android.widget.EditText[@resource-id='mat-input-1']"
		 * ).sendKeys("shri123");
		 * dr.findElementByXPath("//android.widget.Button[@text='Login']").click();
		 * Thread.sleep(16000);
		 * dr.findElementByXPath("//android.widget.Button[@text='1']").click();
		 * dr.findElementByXPath("//android.widget.Button[@text='2']").click();
		 * Thread.sleep(2000);
		 * dr.findElementByXPath("//android.widget.Button[@text='3']").click();
		 * dr.findElementByXPath("//android.widget.Button[@text='4']").click();
		 * dr.findElementByXPath("//android.widget.Button[@text='Login']").click();
		 * dr.findElementByAndroidUIAutomator("text(\"Cancel\")").click();
		 * dr.findElementByXPath("//android.view.View[@text='QSR ']").click();
		 * dr.findElementByXPath("//android.widget.Button[@text='DINE IN']").click();
		 * dr.findElementByXPath("//android.widget.Button[@text='T9']").click();
		 * dr.findElementByXPath("//android.widget.Button[@text='new menu']").click();
		 * dr.findElementByXPath("//android.widget.Button[@text='Finish']").click();
		 * Thread.sleep(5000);
		 * //dr.findElementByXPath("(//android.view.View)[7]").click();
		 * //Thread.sleep(3000);
		 * //dr.findElementByXPath("(//android.widget.TextView)[15]").click();
		 * //Thread.sleep(50000);
		 * dr.findElementByXPath("//android.widget.Button[@text='T9']").click();
		 */


	}

}
