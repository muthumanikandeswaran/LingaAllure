package LingaRos.LingaPos;

import java.io.IOException;
import org.testng.annotations.Test;
import LingaAndroid.LingaAllure.LingaBase;
import LingaAndroid.LingaAllure.Utilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class TestCaseOne  extends LingaBase {

	@Test
	public void PlaceOrder() throws InterruptedException, IOException  {

		AndroidDriver<AndroidElement> dr = Capabilities();

		//AddCustomerPage acp = new AddCustomerPage(dr);
		//BartabPage btp = new BartabPage(dr);
		//BatchPage bp = new BatchPage(dr);
		//CheckStatusPage csp = new CheckStatusPage(dr);
		//CloseDayPage cdp = new CloseDayPage(dr);
		//CustomerProfileScreen cpsp = new CustomerProfileScreen(dr);
		//DashboardPage dp = new DashboardPage(dr);
		//DigitalReceiptScreenPage drsp = new DigitalReceiptScreenPage(dr);
		//FaceIdPage fip = new FaceIdPage(dr);
		//HardwareSettingsPage hsp = new HardwareSettingsPage(dr);
		//OperationPage op = new OperationPage(dr);
		//OrderType otp = new OrderType(dr);
		//PhoneorderPage pop = new PhoneorderPage(dr);
		//PinPage pp = new PinPage(dr);
		//POSSettingsPage psp = new POSSettingsPage(dr);
		//RefundPage rp = new RefundPage(dr);
		//StoreLoginPage slp = new StoreLoginPage(dr);
		//TableLayoutPage tlp = new TableLayoutPage(dr);
		//TillManagementPage tmp = new TillManagementPage(dr);
		Utilities u = new Utilities(dr);

		u.DashboardModuleVerify();
		
		
	
	}

}
