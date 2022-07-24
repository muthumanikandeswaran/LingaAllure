package LingaRos.LingaPos;

import java.io.IOException;
import org.testng.annotations.Test;

import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.OperationPage;
import Linga.pageObjects.OrderType;
import Linga.pageObjects.PinPage;
import Linga.pageObjects.TableLayoutPage;
import LingaAndroid.LingaAllure.LingaBase;
import LingaAndroid.LingaAllure.Utilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CheckSkip_FutureOrder_OprButton_Test extends LingaBase {
	
	@Test
	public void CheckSkip_FutureOrder_OprButton() throws InterruptedException, IOException {

		AndroidDriver<AndroidElement> dr = Capabilities();

		//AddCustomerPage acp = new AddCustomerPage(dr);
		//BartabPage btp = new BartabPage(dr);
		//BatchPage bp = new BatchPage(dr);
		CheckStatusPage csp = new CheckStatusPage(dr);
		//CloseDayPage cdp = new CloseDayPage(dr);
		//CustomerProfileScreen cpsp = new CustomerProfileScreen(dr);
		DashboardPage dp = new DashboardPage(dr);
		//DigitalReceiptScreenPage drsp = new DigitalReceiptScreenPage(dr);
		//FaceIdPage fip = new FaceIdPage(dr);
		//HardwareSettingsPage hsp = new HardwareSettingsPage(dr);
		OperationPage op = new OperationPage(dr);
		OrderType otp = new OrderType(dr);
		//PhoneorderPage pop = new PhoneorderPage(dr);
		PinPage pp = new PinPage(dr);
		//POSSettingsPage psp = new POSSettingsPage(dr);
		//RefundPage rp = new RefundPage(dr);
		//StoreLoginPage slp = new StoreLoginPage(dr);
		TableLayoutPage tlp = new TableLayoutPage(dr);
		//TillManagementPage tmp = new TillManagementPage(dr);
		Utilities u = new Utilities(dr);

		u.DashboardModuleVerify();
		dp.All.click();
		Thread.sleep(2000);
		tlp.QSR.click();
		otp.Later.click();
		otp.Done.click();
		otp.Done.click();
		String check1 = dp.CheckNumber.getText();
		System.out.println(check1);
		Thread.sleep(2000); 
		op.OperationList.click();
		op.Operation.click();
		op.POS.click();
		otp.Later.click();
		otp.Done.click();
		otp.Done.click();
		String check2 = dp.CheckNumber.getText();
		System.out.println(check2);
		if(check2 == check1)
		{
			System.out.println(check1 +"- Check Number is repeated");
		} else {
			System.out.println("Check Number is not repeated");
		}
		dp.All.click();
		csp.QSR.click();
		
	}

}
