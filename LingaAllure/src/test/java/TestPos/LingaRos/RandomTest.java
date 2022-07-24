package TestPos.LingaRos;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import Linga.pageObjects.AddCustomerPage;
import Linga.pageObjects.BartabPage;
import Linga.pageObjects.BatchPage;
import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.CustomerProfileScreen;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.DigitalReceiptScreenPage;
import Linga.pageObjects.FaceIdPage;
import Linga.pageObjects.HardwareSettingsPage;
import Linga.pageObjects.OperationPage;
import Linga.pageObjects.OrderType;
import Linga.pageObjects.POSSettingsPage;
import Linga.pageObjects.PhoneorderPage;
import Linga.pageObjects.PinPage;
import Linga.pageObjects.RefundPage;
import Linga.pageObjects.StoreLoginPage;
import Linga.pageObjects.TableLayoutPage;
import Linga.pageObjects.TillManagementPage;
import LingaAndroid.LingaAllure.LingaBase;
import LingaAndroid.LingaAllure.Utilities;
import Linga.pageObjects.CloseDayPage;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class RandomTest extends LingaBase {


	@Test
	public void tryOne() throws InterruptedException, IOException {

		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid", "ND4C504E2205D0164");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

		AndroidDriver<AndroidElement> dr = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		dr.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		//dr.startActivity(new Activity("com.benseron.pos", "com.benseron.pos.MainActivity"));


		AddCustomerPage acp = new AddCustomerPage(dr);
		BartabPage btp = new BartabPage(dr);
		BatchPage bp = new BatchPage(dr);
		CheckStatusPage csp = new CheckStatusPage(dr);
		CloseDayPage cdp = new CloseDayPage(dr);
		CustomerProfileScreen cpsp = new CustomerProfileScreen(dr);
		DashboardPage dp = new DashboardPage(dr);
		DigitalReceiptScreenPage drsp = new DigitalReceiptScreenPage(dr);
		FaceIdPage fip = new FaceIdPage(dr);
		HardwareSettingsPage hsp = new HardwareSettingsPage(dr);
		OperationPage op = new OperationPage(dr);
		OrderType otp = new OrderType(dr);
		PhoneorderPage pop = new PhoneorderPage(dr);
		PinPage pp = new PinPage(dr);
		POSSettingsPage psp = new POSSettingsPage(dr);
		RefundPage rp = new RefundPage(dr);
		StoreLoginPage slp = new StoreLoginPage(dr);
		TableLayoutPage tlp = new TableLayoutPage(dr);
		TillManagementPage tmp = new TillManagementPage(dr);
		Utilities u = new Utilities(dr);


		//u.storeLogin("shri1@mail.com","admin123");
		dp.Cancel.click();
		
		
		u.setConnectionToOFF();
		
		Thread.sleep(9000);
		u.setConnectionToON();
		
		
		
		
		
		/*
		 * u.defaultPin(); otp.Cancel.click(); Thread.sleep(2000);
		 * 
		 * 
		 * String CheckNo = dp.CheckNumber.getText();
		 * System.out.println("check No is :"+CheckNo);
		 * 
		 * //CHECK NUMBER GETTING CODE+++++++
		 * 
		 * //String CheckNo =
		 * dr.findElement(By.xpath("//*[@text='Check']/../android.widget.TextView[2]")).
		 * getText(); //System.out.println("Check No is :"+CheckNo);
		 * 
		 * //dr.findElement(By.xpath("//*[@text='"+CheckNo+"']/..")).click();
		 * 
		 * 
		 * dr.findElement(By.xpath("//*[@text='Toasted Ravioli']")).click();
		 * dp.Done.click();
		 * dr.findElement(By.xpath("//*[@text='Tater Babies']")).click();
		 * dp.Payment.click(); dp.CashPay.click(); dp.Submit.click();
		 * otp.Cancel.click();
		 */
		
		
		
		
		
		//dp.CustomerAdd.click();
		/*
		 * acp.ByName.click();
		 *  acp.ByPhone.click();
		 *   acp.one.click();
		 * //acp.Backspace.click();
		 *  acp.zero.click(); 
		 *  acp.AddcustomerButton.click();
		 * dr.hideKeyboard(); 
		 * cpsp.CancelCustomerProfileScreen.click();
		 * Thread.sleep(2000);
		 *  dp.CustomerAdd.click();
		 */
		//acp.ByName.click();
		//acp.SearchCustomer.click();
		//acp.SearchCustomer.sendKeys("Rambo");
		//Thread.sleep(2000);
		//acp.NameResultOne.click();
		//Thread.sleep(2000);
		//dp.CustomerNameDisplay.click();
		//dr.hideKeyboard();
		//cpsp.SAVECUSTOMER.click();




		/*
		 * Thread.sleep(2000); 
		 * op.OperationList.click(); 
		 * op.CloseDay.click();
		 * cdp.CloseAllCashiers.click(); 
		 * cdp.Cancel.click(); 
		 * cdp.CloseTheDay.click();
		 * cdp.Yes.click(); 
		 * Thread.sleep(8000); 
		 * cdp.ActiveChecks.click();
		 * Thread.sleep(2000); 
		 * cdp.ActiveCheckCancel.click(); 
		 * cdp.OpenCashier.click();
		 * cdp.Cancel.click(); 
		 * cdp.EmployeeSelectionDropdown.click();
		 * cdp.Cancel.click(); 
		 * Thread.sleep(2000); 
		 * op.OperationList.click();
		 * op.POS.click();
		 *  dp.Cancel.click();
		 */



		/*
		 * dp.All.click(); csp.CheckSearch.click(); csp.CheckSearch.sendKeys("3-001");
		 * 
		 * 
		 * Thread.sleep(2000);
		 * 
		 * op.OperationList.click();
		 * 
		 * //dp.OperationInOrderScreen.click(); 
		 * op.BatchTipAdjustment.click();
		 * Thread.sleep(3000);
		 *  bp.ApplyTotalToggle.click();
		 * 
		 * bp.DeviceSelection.click();
		 * 
		 * bp.GiftCardDevice.click();
		 *  Thread.sleep(2000);
		 *   bp.UserSelection.click();
		 * 
		 * bp.ShriUser.click();
		 * 
		 * bp.Search.click();
		 *  bp.Search.sendKeys("Kathija"); 
		 *  op.Logout.click();
		 */

	}

}
