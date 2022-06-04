package LingaAndroid.LingaAllure;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.DigitalReceiptScreenPage;
import Linga.pageObjects.OperationPage;
import Linga.pageObjects.OrderType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Qsr_AllureTest extends LingaBase {


	@Test
	public void tryOne() throws InterruptedException, IOException {

		AndroidDriver<AndroidElement> dr = capabilities("apprelease");

		Utilities u = new Utilities(dr);
		u.storeLogin("shri1@mail.com","sri1234");

		Thread.sleep(10000);

		u.defaultPin();

		


		for(int i=0;i<5;i++) 
		{
			OrderType ot =new OrderType(dr);
			ot.Cancel.click();
			dr.findElement(By.xpath("//*[@text='PEYNİRLİ LEVREKLİ SALATA 28,90TL']")).click();
			dr.findElement(By.xpath("//*[@text='PEYNİRLİ SOMONLU SALATA 30,90TL']")).click();
			DashboardPage dp = new DashboardPage(dr);
			dp.Payment.click();
			dp.INRPay.click();
			dp.Submit.click();
			
		}

		((AppiumDriver<AndroidElement>)dr).closeApp();

		dr.startActivity(new Activity("com.benseron.pos", "com.benseron.pos.MainActivity"));

		u.defaultPin();
		
		for(int i=0;i<5;i++) 
		{
			OrderType ot =new OrderType(dr);
			ot.Cancel.click();
			dr.findElement(By.xpath("//*[@text='PEYNİRLİ LEVREKLİ SALATA 28,90TL']")).click();
			dr.findElement(By.xpath("//*[@text='PEYNİRLİ SOMONLU SALATA 30,90TL']")).click();
			DashboardPage dp = new DashboardPage(dr);
			dp.Payment.click();
			dp.INRPay.click();
			dp.Submit.click();
			
		}
		((AppiumDriver<AndroidElement>)dr).closeApp();

		dr.startActivity(new Activity("com.benseron.pos", "com.benseron.pos.MainActivity"));

		u.defaultPin();
		for(int i=0;i<5;i++) 
		{
			OrderType ot =new OrderType(dr);
			ot.Cancel.click();
			dr.findElement(By.xpath("//*[@text='PEYNİRLİ LEVREKLİ SALATA 28,90TL']")).click();
			dr.findElement(By.xpath("//*[@text='PEYNİRLİ SOMONLU SALATA 30,90TL']")).click();
			DashboardPage dp = new DashboardPage(dr);
			dp.Payment.click();
			dp.INRPay.click();
			dp.Submit.click();
			
		}



	}

}
