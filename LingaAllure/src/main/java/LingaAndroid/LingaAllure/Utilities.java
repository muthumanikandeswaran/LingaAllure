package LingaAndroid.LingaAllure;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



import Linga.pageObjects.CheckStatusPage;
import Linga.pageObjects.PinPage;
import Linga.pageObjects.StoreLoginPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;




public class Utilities {

	AndroidDriver<AndroidElement> dr;

	public Utilities(AndroidDriver<AndroidElement> dr)
	{
		this.dr=dr;
	}



	public void storeLogin(String email, String password)
	{

		StoreLoginPage slp = new StoreLoginPage(dr);
		slp.Email.sendKeys(email);
		slp.Password.sendKeys(password);
		slp.LoginButton.click();

	}

	public void defaultPin() throws InterruptedException
	{

		PinPage pp = new PinPage(dr);
		pp.One.click();
		pp.Two.click();
		//Thread.sleep(2000);
		pp.Three.click();
		pp.Four.click();
		pp.Backspace.click();
		pp.Four.click();
		pp.Login.click();
		//Thread.sleep(4000);
	}

	public void verifyLoginUser() {

		CheckStatusPage csp = new CheckStatusPage(dr);

		String str =  csp.PosUser.getText();
		Assert.assertEquals("shri admin 1", str);


	}


	public void setConnectionToOFF() {
		try {
			dr.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
			logger.info("Switching OFF the connection : " + dr.getConnection());
		} catch (Exception e) {
			logger.info("Connection could not be switch OFF");
		}
	}

	Logger logger= Logger.getLogger("com.api.jar");

	public void setConnectionToON() {
		try {
			dr.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());

			logger.info("Switching On the connection: " + dr.getConnection());
		} catch (Exception e) {
			logger.info("Connection could not be switch ON");
		}
	}




}
