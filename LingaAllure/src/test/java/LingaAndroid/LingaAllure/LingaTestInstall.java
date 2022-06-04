package LingaAndroid.LingaAllure;
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
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class LingaTestInstall extends LingaBase {


	@Test
	public void tryOne() throws InterruptedException, IOException {

		AndroidDriver<AndroidElement> dr = capabilities("apprelease");

		Utilities u = new Utilities(dr);
		u.storeLogin("shri1@mail.com","sri1234");

		Thread.sleep(6000);

		//u.defaultPin();

		//OrderType ot =new OrderType(dr);
		//ot.Cancel.click();



	}

}
