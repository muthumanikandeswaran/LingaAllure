package LingaRos.LingaPos;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Linga.pageObjects.BatchPage;
import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.DigitalReceiptScreenPage;
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
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.remote.MobileCapabilityType;

public class ContinuousMPPGOfflineSales_ProcessOffline_Test extends LingaBase {


	@Test
	public void ContinuousMPPGOfflineSales_ProcessOffline() throws InterruptedException, IOException {

		AndroidDriver<AndroidElement> dr = Capabilities();


		//AddCustomerPage acp = new AddCustomerPage(dr);
		//BartabPage btp = new BartabPage(dr);
		BatchPage bp = new BatchPage(dr);
		//CheckStatusPage csp = new CheckStatusPage(dr);
		//CloseDayPage cdp = new CloseDayPage(dr);
		//CustomerProfileScreen cpsp = new CustomerProfileScreen(dr);
		DashboardPage dp = new DashboardPage(dr);
		//DigitalReceiptScreenPage drsp = new DigitalReceiptScreenPage(dr);
		//FaceIdPage fip = new FaceIdPage(dr);
		//HardwareSettingsPage hsp = new HardwareSettingsPage(dr);
		OperationPage op = new OperationPage(dr);
		OrderType otp = new OrderType(dr);
		//PhoneorderPage pop = new PhoneorderPage(dr);
		//PinPage pp = new PinPage(dr);
		//POSSettingsPage psp = new POSSettingsPage(dr);
		//RefundPage rp = new RefundPage(dr);
		//StoreLoginPage slp = new StoreLoginPage(dr);
		//TableLayoutPage tlp = new TableLayoutPage(dr);
		//TillManagementPage tmp = new TillManagementPage(dr);
		Utilities u = new Utilities(dr);
        u.DashboardModuleVerify();
        dp.LogOff.click();
		u.setConnectionToOFF();
		u.defaultPin();

		for(int i=0; i<10; i++)
		{	
		Thread.sleep(3000);	
		otp.Cancel.click();

		dr.findElement(By.xpath("//*[@text='Tater Babies']")).click();
		dp.Payment.click();
		dp.MPPGAuthPay.click();
		dp.Manual.click();
		dr.hideKeyboard();
		dp.cardNumber.sendKeys("4111111111111111");
		dp.cardHolderName.sendKeys("Satsang");
		dp.ExpiresOn.sendKeys("1224");
		dp.CVV.sendKeys("123");
		dp.ZipCode.sendKeys("123456");
		dp.Process.click();
		dp.Yes.click();
		}
        Thread.sleep(3000);
		otp.Cancel.click();
		Thread.sleep(2000);
		dp.OperationList.click();
		op.BatchTipAdjustment.click();
		Thread.sleep(5000);
        u.setConnectionToON();
        Thread.sleep(10000);
        bp.ProcessOffline.click();
        	
	}

}
