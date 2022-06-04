package LingaAndroid.LingaAllure;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.DigitalReceiptScreenPage;
import Linga.pageObjects.OperationPage;
import Linga.pageObjects.OrderType;
import Linga.pageObjects.TableLayoutPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Checkdup extends LingaBase {


	@Test
	public void tryOne() throws InterruptedException, IOException {

		AndroidDriver<AndroidElement> dr = capabilities("apprelease");

		Utilities u = new Utilities(dr);
		u.storeLogin("shri1@mail.com","sri1234");

		Thread.sleep(6000);

		u.defaultPin();



		
		
		
		

		OrderType ot =new OrderType(dr);
		ot.Cancel.click();

		DashboardPage dp = new DashboardPage(dr);
		dp.All.click();

		CheckStatusPage csp = new CheckStatusPage(dr);
		csp.Tablelayout.click();
		TableLayoutPage tlp = new TableLayoutPage(dr);
		
		for(int i=0;i<5;i++) {
		
		tlp.NewCheck.click();
		tlp.Table16.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Finish.click();
		}
		Thread.sleep(3000);
		tlp.Table16.click();   
		tlp.fourthcheck.click();
		dp.All.click();
		
		for(int i=0;i<4;i++) {
		tlp.NewCheck.click();
		tlp.Table16.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Finish.click();
		
		//String CheckNo=dr.findElement(By.xpath("//*[@text='Check']/../android.widget.TextView[2]")).getText();
		//System.out.println("Check No is :"+CheckNo);
		
		//dr.findElement(By.xpath("//*[@text='"+CheckNo+"']/..")).click();
		
		}
		
		tlp.NewCheck.click();
		tlp.Table16.click();
		tlp.One.click();
		tlp.Continue.click();
		dp.munch.click();
		dp.Payment.click();
		dp.INRPay.click();
		dp.Submit.click();
		
		
		
		csp.QSR.click();
		
		((AppiumDriver<AndroidElement>)dr).closeApp();

		dr.startActivity(new Activity("com.benseron.pos", "com.benseron.pos.MainActivity"));

		u.defaultPin();
		ot.Cancel.click();
		dp.ServiceTypesDropdown.click();
		dp.DINEINService.click();
		Thread.sleep(3000);
		tlp.Table16.click();
		dp.All.click();
		csp.QSR.click();
		
		


	}

}
