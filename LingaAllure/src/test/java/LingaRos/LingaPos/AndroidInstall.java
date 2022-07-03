package LingaRos.LingaPos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import LingaAndroid.LingaAllure.LingaBase;
import LingaAndroid.LingaAllure.Utilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidInstall extends LingaBase {

	@Test
	public void installAndroidAlone() throws InterruptedException, IOException {

		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\global.properties");       
		
		Properties prop = new Properties();                        
		prop.load(fis);                                        

		File appD = new File("src");
		File app = new File(appD, (String) prop.get("apprelease"));


		DesiredCapabilities caps = new DesiredCapabilities();
		
		String device = (String) prop.get("device");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, device);

		caps.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");

		AndroidDriver<AndroidElement> dr = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		dr.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);		

		Utilities u = new Utilities(dr);
		u.storeLogin("cassanobro@mail.com","bro123");
		u.defaultPin();
		
	}

}