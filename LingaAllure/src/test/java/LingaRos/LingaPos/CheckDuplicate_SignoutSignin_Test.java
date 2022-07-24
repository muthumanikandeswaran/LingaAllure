package LingaRos.LingaPos;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.DashboardPage;
import Linga.pageObjects.PinPage;
import Linga.pageObjects.TableLayoutPage;
import LingaAndroid.LingaAllure.LingaBase;
import LingaAndroid.LingaAllure.Utilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class CheckDuplicate_SignoutSignin_Test  extends LingaBase {

	@Test
	public void CheckDuplicate_SignoutSignin() throws InterruptedException, IOException  {

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
		//OperationPage op = new OperationPage(dr);
		//OrderType otp = new OrderType(dr);
		//PhoneorderPage pop = new PhoneorderPage(dr);
		PinPage pp = new PinPage(dr);
		//POSSettingsPage psp = new POSSettingsPage(dr);
		//RefundPage rp = new RefundPage(dr);
		//StoreLoginPage slp = new StoreLoginPage(dr);
		TableLayoutPage tlp = new TableLayoutPage(dr);
		//TillManagementPage tmp = new TillManagementPage(dr);
		Utilities u = new Utilities(dr);

		u.DashboardModuleVerify();
		Thread.sleep(5000);

		dp.All.click();
		csp.Tablelayout.click();
		tlp.NewCheck.click();
		tlp.Table2.click();
		tlp.One.click();
		tlp.Continue.click();
		String check1 = dp.CheckNumber.getText();
		System.out.println(check1);
		dr.findElement(By.xpath("//*[@text='Category']")).click();
		dr.findElement(By.xpath("//*[@text='category menu']")).click();
		dp.Finish.click();

		tlp.NewCheck.click();
		tlp.Table2.click();
		tlp.One.click();
		tlp.Continue.click();
		String check2 = dp.CheckNumber.getText();
		System.out.println(check2);
		System.out.println("***Check Duplicate verification***");
		if(check2 == check1)
		{
			System.out.println("Check Number repeated");
		}else {
			System.out.println("Check Number is not repeated");
		}
		dr.findElement(By.xpath("//*[@text='Category']")).click();
		dr.findElement(By.xpath("//*[@text='category menu']")).click();

		dp.Finish.click();
		csp.Logout.click();
		pp.SignOut.click();
		pp.Yes.click();
		pp.One.click();
		pp.Two.click();
		pp.Three.click();
		pp.Four.click();
		pp.Continue.click();
		u.storeLogin("cassanobro@mail.com","bro123");
		u.defaultPin();
		dp.Cancel.click();
		String check3 = dp.CheckNumber.getText();

		System.out.println("***Check Duplicate validation***");
		System.out.println(check1);
		System.out.println(check2);
		System.out.println(check3);
		if(check3 == check2) {
			System.out.println("Check Number is repeated");
		}else {
			System.out.println("Check number is not repeated");
		}
		dp.All.click();
		csp.QSR.click();

	}

}
